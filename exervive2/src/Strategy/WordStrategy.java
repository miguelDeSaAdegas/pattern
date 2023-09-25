package Strategy;

public class WordStrategy implements Strategy{

    private char lettre;

    public WordStrategy(char lettre) {
        this.lettre = lettre;
    }

    @Override
    public boolean strategyToExecute(String mot) {
        if (mot.charAt(0) == lettre) return true;
        return false;
    }
}
