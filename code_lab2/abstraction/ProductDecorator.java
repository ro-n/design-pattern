package abstraction;

import java.util.ArrayList;

abstract public class ProductDecorator implements Product {
	
	protected Product productEndpoint;
	protected ArrayList<String> price;
	
	public ProductDecorator(Product p) {
		this.productEndpoint = p;
	}
	
	public Product prev() { return this.productEndpoint; }

	@Override
	abstract public ArrayList<String> price();
}
