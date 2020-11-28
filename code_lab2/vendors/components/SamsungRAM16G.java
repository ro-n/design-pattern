package vendors.components;

import java.util.ArrayList;

import abstraction.Product;
import abstraction.ProductDecorator;
import abstraction.component.Memory;

public class SamsungRAM16G extends ProductDecorator implements Memory {

	public SamsungRAM16G(Product prevProduct) {
		super(prevProduct);
	}

	@Override
	public ArrayList<String> price() {
		this.price = this.productEndpoint.price();
		this.price.add("40$ for " + this.getClass().getSimpleName());
		return this.price;
	}

	@Override
	public void workRAM() {
		// TODO Auto-generated method stub
		
	}
}
