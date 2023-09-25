import observer.Observer;
import observer.ObserverLettre;
import observer.ObserverLigne;
import observer.ObserverMot;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws IOException {
    AnalyseurDeTexte analyseurDeTexte = new AnalyseurDeTexte();
    ObserverLigne observerLigne = new ObserverLigne();
    ObserverLettre observerLettre = new ObserverLettre();
    ObserverMot observerMot = new ObserverMot();

    analyseurDeTexte.addObserver(observerLigne);
    analyseurDeTexte.addObserver(observerLettre);
    analyseurDeTexte.addObserver(observerMot);

    analyseurDeTexte.traitementTexte("./testFile.txt");
  }
}
