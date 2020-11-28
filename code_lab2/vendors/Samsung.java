package vendors;

import abstraction.AbstractFactoryVendor;
import abstraction.Product;
import abstraction.component.CPU;
import abstraction.component.Mainboard;
import abstraction.component.Memory;
import vendors.components.SamsungCPUI5;
import vendors.components.SamsungCPUI7;
import vendors.components.SamsungMainboardLarge;
import vendors.components.SamsungMainboardTiny;
import vendors.components.SamsungRAM16G;
import vendors.components.SamsungRAM32G;

public class Samsung implements AbstractFactoryVendor {

	@Override
	public Mainboard produceMainboard(String type, Product p) {
		if (type.contentEquals("large")) return new SamsungMainboardLarge(p);
		else if (type.contentEquals("tiny")) return new SamsungMainboardTiny(p);
		else return null;
	}

	@Override
	public CPU produceCPU(String type, Product p) {
		if (type.contentEquals("i5")) return new SamsungCPUI5(p);
		else if (type.contentEquals("i7")) return new SamsungCPUI7(p);
		else return null;
	}

	@Override
	public Memory produceMemory(String type, Product p) {
		if (type.contentEquals("16G")) return new SamsungRAM16G(p);
		else if (type.contentEquals("32G")) return new SamsungRAM32G(p);
		else return null;
	}

}
