package observer;

public class ObserverLigne implements Observer {

    private int nbrLigne = 0;

    @Override
    public void traiterLigne(String ligne) {
        nbrLigne++;
    }

    @Override
    public void envoyerResultat() {
        System.out.println("Nombre de ligne : " + nbrLigne);
    }
}
