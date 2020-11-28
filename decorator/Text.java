package assignment_41;

public interface Text {
	
	/*
	 * core class:
	 * 1. provides getter, making the chain.
	 * 2. gaps the bridge between base class and decorator class, making them nestable.
	 */
	public String getCurCypheredString();
}
