package validation;

import java.util.Calendar;

import domaine.CarteDeCredit;

public abstract class Generateur {
	private Generateur successeur;

	public Generateur(Generateur successeur) {
		this.successeur = successeur;
	}

	public abstract boolean valider(String numero);
	public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
		if (successeur == null) return null;
		return successeur.creerCarte(numero, dateExpiration, nom);
	};
}
