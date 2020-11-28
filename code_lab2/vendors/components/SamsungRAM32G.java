package vendors.components;

import java.util.ArrayList;

import abstraction.Product;
import abstraction.ProductDecorator;
import abstraction.component.Memory;

public class SamsungRAM32G extends ProductDecorator implements Memory {

	public SamsungRAM32G(Product prevProduct) {
		super(prevProduct);
	}

	@Override
	public ArrayList<String> price() {
		this.price = this.productEndpoint.price();
		this.price.add("35$ for " + this.getClass().getSimpleName());
		return this.price;
	}

	@Override
	public void workRAM() {
		// TODO Auto-generated method stub
		
	}
}
