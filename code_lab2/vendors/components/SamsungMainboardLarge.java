package vendors.components;

import java.util.ArrayList;

import abstraction.Product;
import abstraction.ProductDecorator;
import abstraction.component.Mainboard;

public class SamsungMainboardLarge extends ProductDecorator implements Mainboard {

	public SamsungMainboardLarge(Product prevProduct) {
		super(prevProduct);
	}

	@Override
	public ArrayList<String> price() {
		this.price = this.productEndpoint.price();
		this.price.add("5$ for " + this.getClass().getSimpleName());
		return this.price;
	}

	@Override
	public void workBoard() {
		// TODO Auto-generated method stub
		
	}

}
