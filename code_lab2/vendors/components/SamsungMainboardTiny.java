package vendors.components;

import java.util.ArrayList;

import abstraction.Product;
import abstraction.ProductDecorator;
import abstraction.component.Mainboard;

public class SamsungMainboardTiny extends ProductDecorator implements Mainboard {

	public SamsungMainboardTiny(Product prevProduct) {
		super(prevProduct);
	}

	@Override
	public ArrayList<String> price() {
		this.price = this.productEndpoint.price();
		this.price.add("12$ for " + this.getClass().getSimpleName());
		return this.price;
	}

	@Override
	public void workBoard() {
		// TODO Auto-generated method stub
		
	}
}
