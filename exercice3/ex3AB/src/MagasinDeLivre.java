public class MagasinDeLivre implements AbstractFatcory{

	@Override
	public Product createProduct(String name, int anneeDeParution) {
		return new Livre(name, anneeDeParution);
	}
}
