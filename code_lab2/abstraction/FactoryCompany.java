package abstraction;

import java.util.ArrayList;
import java.util.HashMap;

import helper.Pair;

public abstract class FactoryCompany {
	protected HashMap<String, AbstractFactoryVendor> vendorMap;
	protected AbstractFactoryVendor vendor;
	public FactoryCompany(HashMap<String, AbstractFactoryVendor> vendors) {
		this.vendorMap = vendors;
	}
	public void setVendor(HashMap<String, AbstractFactoryVendor> newVendor) {
		this.vendorMap = newVendor;
	}
	public abstract Computer produce(ArrayList<Pair<String, Pair<String, String>>> demands);
}
