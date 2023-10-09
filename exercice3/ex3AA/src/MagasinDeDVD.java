import java.util.HashMap;
import java.util.Map;


public class MagasinDeDVD extends Magasin{

	@Override
	public Product createProduct(String name, int anneeDeParution) {
		return new DVD(name, anneeDeParution);
	}
}
