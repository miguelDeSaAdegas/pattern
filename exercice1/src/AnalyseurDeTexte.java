import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AnalyseurDeTexte {

	public static void main(String[] args) throws IOException {
		BufferedReader lecteurAvecBuffer = null;
		String ligne;
		int nbrMots = 0, nbrLignes = 0, nbrPalindromes = 0, nbrBelgique = 0;
		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader(args[0]));
		} catch (FileNotFoundException e) {
			System.out.println("Erreur d'ouverture");
		}
		while ((ligne = lecteurAvecBuffer.readLine()) != null) {
			nbrLignes++;
			if (ligne.contains("Belgique")) {
				nbrBelgique++;
			}
			for (String mot : ligne.trim().split(" ")) {
				nbrMots++;
				StringBuffer temp = new StringBuffer(mot);
				if (mot.equals(temp.reverse().toString())) {
					nbrPalindromes++;
				}
			}

		}
		lecteurAvecBuffer.close();
		System.out.println("Il y avait " + nbrLignes + " lignes.");
		System.out.println("Il y avait " + nbrMots + " mots.");
		System.out.println("Il y avait " + nbrPalindromes + " palindromes.");
		System.out.println("Il y avait " + nbrBelgique + " lignes contenant Belgique.");
	}
}
