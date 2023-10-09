import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {
    private Map<String, Product> map = new HashMap<>();

    public void ajouter(String name, int anneeDeParution){
        Product product = createProduct(name, anneeDeParution);
        map.put(name,product);
    }
    public Product retourner(String name){
        return map.get(name);
    }

    public abstract Product createProduct(String name, int anneeDeParution);
}
