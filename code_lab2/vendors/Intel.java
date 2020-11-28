package vendors;

import abstraction.AbstractFactoryVendor;
import abstraction.Product;
import abstraction.component.CPU;
import abstraction.component.Mainboard;
import abstraction.component.Memory;
import vendors.components.IntelCPUI7;
import vendors.components.IntelCPUI9;
import vendors.components.IntelMainboardLarge;
import vendors.components.IntelMainboardTiny;
import vendors.components.IntelRAM16G;
import vendors.components.IntelRAM8G;

public class Intel implements AbstractFactoryVendor {

	@Override
	public Mainboard produceMainboard(String type, Product p) {
		if (type.contentEquals("large")) return new IntelMainboardLarge(p);
		else if (type.contentEquals("tiny")) return new IntelMainboardTiny(p);
		else return null;
	}

	@Override
	public CPU produceCPU(String type, Product p) {
		if (type.contentEquals("i7")) return new IntelCPUI7(p);
		else if (type.contentEquals("i9")) return new IntelCPUI9(p);
		else return null;
	}

	@Override
	public Memory produceMemory(String type, Product p) {
		if (type.contentEquals("8G")) return new IntelRAM8G(p);
		else if (type.contentEquals("16G")) return new IntelRAM16G(p);
		else return null;
	}

}
