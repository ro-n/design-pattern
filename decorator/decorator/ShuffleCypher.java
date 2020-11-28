package assignment_41.decorator;

import assignment_41.CypheringDecorator;
import assignment_41.Text;
import assignment_41.helper.RandomShuffle;

public class ShuffleCypher extends CypheringDecorator {
	
	private String randomShuffle(String plainStr) {
		return RandomShuffle.shuffleString(plainStr);
	}

	public ShuffleCypher(Text newText) {                   /* back ref */
		super(newText);
	}
	
	public String getCurCypheredString() {                 /* decorating */
		return randomShuffle(txtInPreDecoratorOrEndpoint.getCurCypheredString());
	}
	 
}
