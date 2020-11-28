package vendors.components;

import java.util.ArrayList;

import abstraction.Product;
import abstraction.ProductDecorator;
import abstraction.component.Memory;

public class IntelRAM16G extends ProductDecorator implements Memory {

	public IntelRAM16G(Product prevProduct) {
		super(prevProduct);
	}

	@Override
	public ArrayList<String> price() {
		this.price = this.productEndpoint.price();
		this.price.add("20$ for " + this.getClass().getSimpleName());
		return this.price;
	}

	@Override
	public void workRAM() {
		// TODO Auto-generated method stub
		
	}

}
