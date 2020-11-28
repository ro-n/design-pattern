package factorys;

import factorys.products.Product;

public interface Factory {
	public Product createProduct(String type);
}
