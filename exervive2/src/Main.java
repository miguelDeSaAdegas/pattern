import Strategy.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Usage : java ListerMots1 fichier");
            System.exit(1);
        }
        new ListerMots(args[0]).imprimerSiStrategy(new OuStrategy(new WordStrategy('k'),new LengthStrategy(7),new PalindromeStrategy(),new WordStrategy('b')));
    }
}
