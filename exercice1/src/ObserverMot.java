public class ObserverMot implements Observer{

  int nbrMot = 0;
  @Override
  public void traiterLigne(String ligne) {
    for (String s : ligne.trim().split(" ")) {
      nbrMot++;
    }
  }

  @Override
  public void envoyerResultat() {
    System.out.println("Nombre de mot : " + nbrMot);
  }
}
