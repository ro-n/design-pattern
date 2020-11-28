package vendors.components;

import java.util.ArrayList;

import abstraction.Product;
import abstraction.ProductDecorator;
import abstraction.component.Mainboard;

public class IntelMainboardLarge extends ProductDecorator implements Mainboard {

	public IntelMainboardLarge(Product prevProduct) {
		super(prevProduct);
	}

	@Override
	public ArrayList<String> price() {
		this.price = this.productEndpoint.price();
		this.price.add("10$ for " + this.getClass().getSimpleName());
		return this.price;
	}

	@Override
	public void workBoard() {
		// TODO Auto-generated method stub
		
	}

}
