package gov;

import java.util.ArrayList;
import java.util.HashMap;

import abstraction.Computer;
import abstraction.Product;

public class SupervisionDepartment {
	public static Computer check(Computer computer) {
		computer.setUUID(computer.hashCode());
		HashMap<String, ArrayList<Product>> map = computer.checkComponents();
		for (String component : Computer.componentsPool) {
			if (map.get(component).size() < 1) { computer.setQualification(false); }
//			System.out.println(component + ": " + map.get(component).size());
		}
		return computer;
	}
}
