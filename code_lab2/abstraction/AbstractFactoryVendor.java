package abstraction;

import abstraction.component.CPU;
import abstraction.component.Mainboard;
import abstraction.component.Memory;

public interface AbstractFactoryVendor {
	public abstract Mainboard produceMainboard(String type, Product p);
	public abstract CPU produceCPU(String type, Product p);
	public abstract Memory produceMemory(String type, Product p);
}
