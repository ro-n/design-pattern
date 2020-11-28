package factorys;

import factorys.products.Product;
import factorys.products.tcl.*;

public class TCL implements Factory {

	public Product createProduct(String type) {
		if (type.equals("fridge")) {
			return new TCLFridge();
		} else {
			return null;
		}
	}

}
