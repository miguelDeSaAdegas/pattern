import java.util.HashMap;
import java.util.Map;

public class MagasinDeLivre extends Magasin{
	@Override
	public Product createProduct(String name, int anneeDeParution) {
		return new Livre(name, anneeDeParution);
	}
}
