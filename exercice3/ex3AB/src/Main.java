public class Main {
    public static void main(String[] args) {
        MagasinDeDVD factoryDVD = new MagasinDeDVD();
        MagasinDeLivre factoryLivre = new MagasinDeLivre();
        Magasin magasinDVD = new Magasin(factoryDVD);
        Magasin magasinLivre = new Magasin(factoryLivre);

        magasinDVD.ajouter("yamamerde",2006);
        magasinDVD.ajouter("guilherme",2005);

        magasinLivre.ajouter("boltrik",2005);
        magasinLivre.ajouter("alicia",2004);

        System.out.println(magasinDVD.retourner("yamamerde").toString());
        System.out.println(magasinLivre.retourner("boltrik").toString());
    }
}
