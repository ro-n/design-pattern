package factorys;

import factorys.products.Product;
import factorys.products.apple.*;

public class Apple implements Factory {

	public Product createProduct(String type) {
		if (type.equals("fridge")) {
			return new AppleFridge();
		} else if (type.equals("tv")) {
			return new AppleTV();
		} else {
			return null;
		}
	}

}
