public class Main {
    public static void main(String[] args) {
        MagasinDeDVD magasinDeDVD = new MagasinDeDVD();
        magasinDeDVD.ajouter("yamamerde",2006);
        magasinDeDVD.ajouter("guilherme",2005);

        MagasinDeLivre magasinDeLivre = new MagasinDeLivre();
        magasinDeLivre.ajouter("boltrik",2005);
        magasinDeLivre.ajouter("alicia",2004);

        System.out.println(magasinDeDVD.retourner("yamamerde").toString());
        System.out.println(magasinDeLivre.retourner("boltrik").toString());
    }
}
