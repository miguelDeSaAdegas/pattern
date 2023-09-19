package observer;

public class ObserverLettre implements Observer{

  int nbrLettre = 0;
  @Override
  public void traiterLigne(String ligne) {
    for (char c : ligne.toCharArray()) {
        if (Character.isLetter(c)) {
          nbrLettre++;
        }
    }
  }

  @Override
  public void envoyerResultat() {
    System.out.println("Nombre de lettre : " + nbrLettre);
  }
}
