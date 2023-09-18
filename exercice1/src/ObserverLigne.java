public class ObserverLigne implements Observer {

    int numLigne = 0;

    @Override
    public void traiterLigne(String ligne) {
        numLigne++;
    }

    @Override
    public void envoyerResultat() {
        System.out.println(numLigne);
    }
}
