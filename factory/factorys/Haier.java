package factorys;

import factorys.products.Product;
import factorys.products.haier.*;

public class Haier implements Factory {

	public Product createProduct(String type) {
		if (type.equals("phone")) {
			return new HaierMobilephone();
		} else if (type.equals("tv")) {
			return new HaierTV();
		} else {
			return null;
		}
	}

}
