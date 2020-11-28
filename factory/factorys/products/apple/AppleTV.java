package factorys.products.apple;

import factorys.products.Product;

public class AppleTV extends Product {

	@Override
	public void play() {
		System.out.println("I'm an Apple TV.");
	}

}