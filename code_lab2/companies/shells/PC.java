package companies.shells;

import java.util.ArrayList;
import java.util.HashMap;

import abstraction.Computer;
import abstraction.Product;

public class PC extends Computer {

	public PC(Product p) {
		super(p);
	}

	@Override
	public HashMap<String, ArrayList<Product>> checkComponents() {
		return this.mapComponent;
	}

	@Override
	public void beALaptopOrPC() {
		System.out.println("I'm a PC,"
				+ " and " + (this.getQualification() ? "is" : "is not")
				+ " a qualified PC");
	}


}
