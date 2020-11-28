package test;

import helper.StockThresholdMapping;

public class TestAmountPriceMapping {
	public static void main(String[] args) {
		StockThresholdMapping map = new StockThresholdMapping(new int[] {1, 3}, 10, 50);
		System.out.println("0->" + Integer.toString(map.calc(0)) + "\n"
			+ "2->" + Integer.toString(map.calc(2)) + "\n"
			+ "6->" + Integer.toString(map.calc(6)));
		
		map = new StockThresholdMapping(new int[] {1, 3, 10, 12}, 10, 50);
		System.out.println("0->" + Integer.toString(map.calc(0)) + "\n"
				+ "2->" + Integer.toString(map.calc(2)) + "\n"
				+ "6->" + Integer.toString(map.calc(6)) + "\n"
				+ "11->" + Integer.toString(map.calc(11)) + "\n"
				+ "17->" + Integer.toString(map.calc(17)));
	}
}
