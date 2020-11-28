package vendors.components;

import java.util.ArrayList;

import abstraction.Product;
import abstraction.ProductDecorator;
import abstraction.component.CPU;

public class SamsungCPUI7 extends ProductDecorator implements CPU {

	public SamsungCPUI7(Product prevProduct) {
		super(prevProduct);
	}

	@Override
	public ArrayList<String> price() {
		this.price = this.productEndpoint.price();
		this.price.add("25$ for " + this.getClass().getSimpleName());
		return this.price;
	}

	@Override
	public void workCPU() {
		// TODO Auto-generated method stub
		
	}

}
