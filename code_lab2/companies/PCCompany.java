package companies;

import java.util.ArrayList;
import java.util.HashMap;

import abstraction.AbstractFactoryVendor;
import abstraction.FactoryCompany;
import abstraction.Product;
import companies.shells.PC;
import helper.Pair;

public class PCCompany extends FactoryCompany {

	public PCCompany(HashMap<String, AbstractFactoryVendor> vendors) {
		super(vendors);
	}

	@Override
	public PC produce(ArrayList<Pair<String, Pair<String, String>>> demands) {
		
		ComputerBase base = new ComputerBase("15");
		Product prevProduct = base;
		
		for (Pair<String, Pair<String, String>> demand : demands) {
			
			String brand = demand.getKey();
			String component = demand.getValue().getKey();
			String specification = demand.getValue().getValue();
			
			this.vendor = this.vendorMap.get(brand);
			switch (component) {
				case "CPU": prevProduct = (Product) this.vendor.produceCPU(specification, prevProduct); break;
				case "RAM": prevProduct = (Product) this.vendor.produceMemory(specification, prevProduct); break;
				case "Board": prevProduct = (Product) this.vendor.produceMainboard(specification, prevProduct); break;
				default: break;
			}
		}
		
		PC pc = new PC(prevProduct);
		
		return pc;
	}

}
