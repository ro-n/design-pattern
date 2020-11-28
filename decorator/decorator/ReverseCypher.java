package assignment_41.decorator;

import assignment_41.CypheringDecorator;
import assignment_41.Text;
import assignment_41.helper.Reverser;

public class ReverseCypher extends CypheringDecorator {
	
	private String reverse(String plainTxt) {
		return Reverser.reverseString(plainTxt);
	}

	public ReverseCypher(Text newText) {                   /* back ref */
		super(newText);
	}
	
	public String getCurCypheredString() {                 /* decorating */
		return reverse(txtInPreDecoratorOrEndpoint.getCurCypheredString());
	}
	 
}