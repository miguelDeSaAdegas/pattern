import java.util.HashMap;
import java.util.Map;

public class Magasin {

    private AbstractFatcory abstractFatcory;
    private Map<String, Product> map = new HashMap<>();

    public Magasin(AbstractFatcory abstractFatcory) {
        this.abstractFatcory = abstractFatcory;
    }

    public void ajouter(String name, int anneeDeParution){
        Product product = abstractFatcory.createProduct(name, anneeDeParution);
        map.put(name,product);
    }
    public Product retourner(String name){
        return map.get(name);
    }

}
