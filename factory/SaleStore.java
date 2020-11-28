import factorys.Factory;
import factorys.products.Product;

public class SaleStore {
	Factory factory;

	SaleStore(Factory fty) {
		factory = fty;
	}
	
	void setFactory(Factory newFty) {
		factory = newFty;
	}
	
	Product sell(String itemSale) {
		if (itemSale.equals("")) return null;
		return factory.createProduct(itemSale);
	}
}
