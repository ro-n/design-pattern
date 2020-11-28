package vendors.components;

import java.util.ArrayList;

import abstraction.Product;
import abstraction.ProductDecorator;
import abstraction.component.CPU;

public class IntelCPUI9 extends ProductDecorator implements CPU {

	public IntelCPUI9(Product prevProduct) {
		super(prevProduct);
	}

	@Override
	public ArrayList<String> price() {
		this.price = this.productEndpoint.price();
		this.price.add("35$ for " + this.getClass().getSimpleName());
		return this.price;
	}

	@Override
	public void workCPU() {
		// TODO Auto-generated method stub
		
	}

}
