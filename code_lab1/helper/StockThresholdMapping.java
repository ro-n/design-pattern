package helper;

public class StockThresholdMapping {
	private int[] threshes;
	private int high;
	private int low;
	
	private int gap;
	
	public int calc(int curAmount) {
		int retPrice = this.low;
		for (int eachThresh : this.threshes) {
			if (curAmount < eachThresh) return retPrice;
			else retPrice += this.gap;
		}
		return this.high;
	}
	
	public StockThresholdMapping(int[] threshes, int lowPrice, int highPrice) {
		this.threshes = threshes;
		this.high = highPrice;
		this.low = lowPrice;
		
		this.gap = (int) ((this.high-this.low) / (threshes.length+1));
	}
}
