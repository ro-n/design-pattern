package companies.shells;

import java.util.ArrayList;
import java.util.HashMap;

import abstraction.Computer;
import abstraction.Product;

public class Laptop extends Computer {

	public Laptop(Product p) {
		super(p);
	}

	@Override
	public HashMap<String, ArrayList<Product>> checkComponents() {
		return this.mapComponent;
	}

	@Override
	public void beALaptopOrPC() {
		System.out.println("I'm a Laptop,"
				+ " and " + (this.getQualification() ? "is" : "is not")
				+ " a qualified Laptop");
	}
}
