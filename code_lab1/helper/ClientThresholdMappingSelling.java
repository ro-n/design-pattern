package helper;

import abstraction.ClientThresholdMapping;

public class ClientThresholdMappingSelling implements ClientThresholdMapping {
	private int thresh;
	
	public boolean calc(int curPrice) {
		if (curPrice > thresh) return true;
		return false;
	}
	
	public ClientThresholdMappingSelling(int thresh) {
		this.thresh = thresh;
	}
}