package validation;

import domaine.CarteDeCredit;
import domaine.DinersClub;

import java.util.Calendar;

public class GenerateurDinersClubImpl extends Generateur {
    public GenerateurDinersClubImpl(Generateur successeur) {
        super(successeur);
    }

    @Override
    public boolean valider(String numero) {
        return numero.startsWith("36") && numero.length() == 14;
    }

    @Override
    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        if (valider(numero)) return new DinersClub(numero, dateExpiration, nom);
        return super.creerCarte(numero, dateExpiration, nom);
    }
}
