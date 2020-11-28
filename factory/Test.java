import factorys.*;
import factorys.products.Product;

public class Test {
	/*
	 * It's a factory pattern with store wrapped,
	 * providing runtime factory altering.
	 * All comment in this file.
	 */

	public static void main(String[] args) {
		Factory[] fty = new Factory[4];                    /* create a list of factory interface ref */
		fty[0] = new Apple();                              /* create a series of concrete factory */
		fty[1] = new Haier();
		fty[2] = new Hisense();
		fty[3] = new TCL();

		Product[] p = new Product[4];                      /* create a list of product ref */
		SaleStore store = new SaleStore(fty[0]);           /* create a store */
		p[0] = store.sell("tv");                           /* use store to get product */
		p[0].play();                                       /* use the product */

		store.setFactory(fty[1]);                          /* update the factory and do the same */
		p[1] = store.sell("phone");
		p[1].play();

		store.setFactory(fty[2]);
		p[2] = store.sell("oven");
		p[2].play();

		store.setFactory(fty[3]);
		p[3] = store.sell("fridge");
		p[3].play();
	}
}

/* example output:
 * I'm an Apple TV.
 * I'm a Haier Mobilephone.
 * I'm a Hisense Oven.
 * I'm a TCL Fridge.
 */

/* to implement abstract factory pattern,
 * one should deal with the tv, phone, oven kinda like things,
 * make them create by srcreen, processor, CPU and more detailed things with their own style, which
 * should make the difference between AppleTV and HaierTV (in this project, they are nearly the same),
 * without which the abstract factory degrade to normal factory.
 *
 * When there are no AppleTV or HaierTV,
 * factory will only return the TV,
 * which degrade to simple factory.
 */

