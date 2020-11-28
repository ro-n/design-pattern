package assignment_41.helper;

// import java.util.*;

public class RandomShuffle {
	
	/* 
	 * One should note that,
	 * there can an increasing number of cypher methods,
	 * the relationship between CypherDecorator and CallingObjects should follow a
	 * composition relationship rather than the way it is implemented in this project.
	 */
	
	/* 
	 * Notice Test.java's output would be incorrect since this project does a
	 * calling-time decoration that printing differs from calling to calling.
	 * 
	 * But it can be avoided through implementing constructing-time shuffling,
	 * in which way it will be stored in object at once, kinka like, huh? iterative version of decorator pattern.
	 * I don't know whether it is correct.
	 * 
	 * one can replace the function with the following:
	 * 
	public static String shuffleString(String orgString) {		
		List<String> letters = Arrays.asList(orgString.split(""));
		Collections.shuffle(letters);
		String shuffled = "";
		for (String letter : letters) {
			shuffled += letter;
		}
		return shuffled;
	}
	*/
	
	public static String shuffleString(String orgString) { /* return a fake shuffle string */
		return new String(orgString + "^_^");
	}
}
