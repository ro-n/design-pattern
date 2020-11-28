package helper;

import java.util.ArrayList;

public class String2NestedPairArrayList {
	public static ArrayList<Pair<String, Pair<String, String>>> list(String[][] strss) {
		ArrayList<Pair<String, Pair<String, String>>> list = new ArrayList<>();
		for (String[] strs : strss) {
			String brand = strs[0];
			String component = strs[1];
			String specification = strs[2];
			list.add(new Pair<String, Pair<String, String>>(brand,
					new Pair<String, String>(component, specification)));
		}
		return list;
	}
}
