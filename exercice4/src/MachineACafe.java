public class MachineACafe {
    public final int idle = 0;
    public final int collecte = 1;
    public final int pasAssez = 2;

    private int montantEnCours = 0;

    private enum EtatCourant {
        IDLE {
			@Override
			public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe machineACafe) {
				machineACafe.afficherPasAssez(toucheBoisson);
			}

			@Override
			public void rendreMonnaie(MachineACafe machineACafe) {
			}
        }, COLLECTE {
            @Override
            public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe machineACafe) {
                if (toucheBoisson.getPrix() > machineACafe.montantEnCours) {
                    machineACafe.boisson = toucheBoisson;
                    machineACafe.afficherPasAssez(machineACafe.boisson);
                    machineACafe.boisson = toucheBoisson;
                    machineACafe.etatCourant = PASASSEZ;
                    return;
                }
                machineACafe.montantEnCours -= toucheBoisson.getPrix();
                machineACafe.afficherBoisson(toucheBoisson);
                machineACafe.afficherMontant();
                if (machineACafe.montantEnCours == 0)
                    machineACafe.etatCourant = IDLE;
                else
                    machineACafe.etatCourant = COLLECTE;
            }
        }, PASASSEZ {
            @Override
            public void entrerMonnaie(Piece piece, MachineACafe machineACafe) {
                if (machineACafe.boisson.getPrix() > machineACafe.montantEnCours) {
                    machineACafe.afficherPasAssez(machineACafe.boisson);
                } else {
                    machineACafe.montantEnCours -= machineACafe.boisson.getPrix();
                    machineACafe.afficherBoisson(machineACafe.boisson);
                    machineACafe.boisson = null;
                    machineACafe.afficherMontant();
                    if (machineACafe.montantEnCours == 0)
                        machineACafe.etatCourant = IDLE;
                    else
                        machineACafe.etatCourant = COLLECTE;
                }
            }

			@Override
			public void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe machineACafe) {
				throw new IllegalStateException();
			}
        };

        public void entrerMonnaie(Piece piece, MachineACafe machineACafe) {
            machineACafe.etatCourant = EtatCourant.COLLECTE;
        }

        public abstract void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe machineACafe);

        public void rendreMonnaie(MachineACafe machineACafe) {
            machineACafe.afficherRetour();
            machineACafe.montantEnCours = 0;
            machineACafe.boisson = null;
        }
    }

    private EtatCourant etatCourant = EtatCourant.IDLE;
    private ToucheBoisson boisson = null;

    public void afficherMontant() {
        System.out.println(montantEnCours + " cents disponibles");
    }

    public void afficherRetour() {
        System.out.println(montantEnCours + " cents rendus");
    }

    public void afficherPasAssez(ToucheBoisson toucheBoisson) {
        System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
        System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
    }

    public void afficherBoisson(ToucheBoisson toucheBoisson) {
        System.out.println("Voici un " + toucheBoisson);

    }

    public void entrerMonnaie(Piece piece) {
        montantEnCours += piece.getValeur();
        afficherMontant();
        etatCourant.entrerMonnaie(piece, this);
    }

    public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
        etatCourant.selectionnerBoisson(toucheBoisson, this);
    }

    public void rendreMonnaie() {
        etatCourant.rendreMonnaie(this);
        etatCourant = EtatCourant.IDLE;
    }
}
