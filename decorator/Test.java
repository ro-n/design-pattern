package assignment_41;

import assignment_41.decorator.*;

public class Test {
	public static void main(String[] args) {
		
		CypheringDecorator[] decorators = new CypheringDecorator[3];
														   /* the decorators for plain text */
		PlainText plainTxt = new PlainText("HelloWorld!"); /* create a plain text object */
		
		decorators[0] = new ShuffleCypher(plainTxt);       /* first time shuffle, level 1 decorator on */
		decorators[1] = new ReverseCypher(decorators[0]);  /* second time shuffle, level 2 decorator on */
		decorators[2] = new ReShuffleCypher(decorators[1]);/* third time shuffle, level 3 decorator on */
		
		
		System.out.println("Base string is " + plainTxt.getCurCypheredString());
														   /* output original string */
		for (CypheringDecorator decorator : decorators) {  /* looping through the decorators, print it out */
			System.out.println("Current ciphered text is "
				+ decorator.getCurCypheredString());
		}
		
		String out = decorators[2].getCurCypheredString(); /* output final result */
		System.out.println("Final result is " + out);
		
	}
}
