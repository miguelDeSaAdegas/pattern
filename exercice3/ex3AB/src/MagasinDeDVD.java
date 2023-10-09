public class MagasinDeDVD implements AbstractFatcory{

	@Override
	public Product createProduct(String name, int anneeDeParution) {
		return new DVD(name, anneeDeParution);
	}
}
