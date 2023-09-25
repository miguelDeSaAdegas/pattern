package Strategy;

public class PalindromeStrategy implements Strategy{

    public boolean strategyToExecute(String mot) {
        if (mot == null)
            return false;
        StringBuffer stringbuffer = new StringBuffer(mot);
        return mot.equals(stringbuffer.reverse().toString());
    }
}
