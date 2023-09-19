import observer.Observer;
import observer.ObserverLettre;
import observer.ObserverLigne;
import observer.ObserverMot;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws IOException {
    ObserverLigne observerLigne = new ObserverLigne();
    ObserverLettre observerLettre = new ObserverLettre();
    ObserverMot observerMot = new ObserverMot();

    ArrayList<Observer> listObserver = new ArrayList<>();
    listObserver.add(observerLigne);
    listObserver.add(observerLettre);
    listObserver.add(observerMot);

    AnalyseurDeTexte.traitementTexte("exercice1/testFile.txt",listObserver);
  }
}
