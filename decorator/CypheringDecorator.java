package assignment_41;

abstract public class CypheringDecorator implements Text {
	
	/*
	 * the decorator class, all decorators extend this class.
	 * sub classes will be able to:
	 * 
	 * 1. construct with a previous object, which the object will be a decorator or base class
	 * 2. return an object (string in this project) represents the decorated object
	 */
	
	protected Text txtInPreDecoratorOrEndpoint;
	
	public CypheringDecorator(Text newText) {              /* constructor */
		this.txtInPreDecoratorOrEndpoint = newText;
	}
	
	public String getCurCypheredString() {                 /* a calling time decorating, recursively */
		return null;
	}
}
