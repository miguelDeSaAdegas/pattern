package validation;

import domaine.CarteDeCredit;
import domaine.MasterCard;

import java.util.Calendar;

public class GenerateurMasterCardImpl extends Generateur {
    public GenerateurMasterCardImpl(Generateur successeur) {
        super(successeur);
    }

    @Override
    public boolean valider(String numero) {
        if (numero.charAt(0) != '5') return false;
        if ((int)(numero.charAt(1)-'0') > 0 && (int)(numero.charAt(1)-'0') < 6 && numero.length() == 16) return true;
        return false;
    }

    @Override
    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
        if (valider(numero)) return new MasterCard(numero, dateExpiration, nom);
        return super.creerCarte(numero, dateExpiration, nom);
    }
}
