package helper;

import java.util.HashMap;

import abstraction.AbstractFactoryVendor;
import vendors.Intel;
import vendors.Samsung;

public class String2Vendor {
	public static HashMap<String, AbstractFactoryVendor> map() {
		HashMap<String, AbstractFactoryVendor> map =
				new HashMap<>();
		map.put("Intel", new Intel());
		map.put("Samsung", new Samsung());
		return map;
	}
}
