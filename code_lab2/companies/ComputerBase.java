package companies;

import java.util.ArrayList;

import abstraction.Product;

public class ComputerBase implements Product {
	
	private ArrayList<String> price;
	
	ComputerBase(String basePrice) {
		price = new ArrayList<>();
		price.add(basePrice + "$ for base");
	}

	@Override
	public ArrayList<String> price() {
		return price;
	}

}
