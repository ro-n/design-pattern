package factorys;

import factorys.products.Product;
import factorys.products.hisense.*;

public class Hisense implements Factory {

	public Product createProduct(String type) {
		if (type.equals("oven")) {
			return new HisenseOven();
		} else if (type.equals("tv")) {
			return new HisenseTV();
		} else {
			return null;
		}
	}

}