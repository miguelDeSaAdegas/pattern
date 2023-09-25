package Strategy;

public class LengthStrategy implements Strategy{
    private int longueur;

    public LengthStrategy(int longueur) {
        this.longueur = longueur;
    }

    @Override
    public boolean strategyToExecute(String mot) {
        if (mot.length() == longueur) return true;
        return false;
    }
}
