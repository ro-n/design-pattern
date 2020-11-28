package helper;

import abstraction.ClientThresholdMapping;

public class ClientThresholdMappingUpdating implements ClientThresholdMapping {
	private int thresh;
	
	public boolean calc(int gap) {
		if (gap > thresh) return true;
		return false;
	}
	
	public ClientThresholdMappingUpdating(int thresh) {
		this.thresh = thresh;
	}
}
