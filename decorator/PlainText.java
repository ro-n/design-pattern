package assignment_41;

public class PlainText implements Text {
		
	String str;
	
	PlainText(String text) {
		str = text;
	}

	@Override
	public String getCurCypheredString() {                 /* endpoint of recurse */
		return str;
	}

}
