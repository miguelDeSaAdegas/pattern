import observer.Observer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AnalyseurDeTexte {
	private ArrayList<Observer> listObserver = new ArrayList<>();

	public void traitementTexte(String filePath) throws IOException {
		BufferedReader lecteurAvecBuffer = null;
		String ligne;
		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader(filePath));
		} catch (FileNotFoundException e) {
			System.out.println("Erreur d'ouverture");
			return;
		}
		if (lecteurAvecBuffer != null) {
			while ((ligne = lecteurAvecBuffer.readLine()) != null) {
				for (Observer observer : listObserver) {
					observer.traiterLigne(ligne);
				}
			}
		} else {
			System.out.println("Fichier non fournie ou vide");
			return;
		}
		lecteurAvecBuffer.close();

		for (Observer observer : listObserver) {
			observer.envoyerResultat();
		}
	}

	public void addObserver(Observer observer) {
		listObserver.add(observer);
	}
}
