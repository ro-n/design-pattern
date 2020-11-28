package assignment_41.helper;

import java.util.*;

public class Reverser {
	/* 
	 * One should note that,
	 * there can an increasing number of cypher methods,
	 * the relationship between CypherDecorator and CallingObjects should follow a
	 * composition relationship rather than the way it is implemented in this project.
	 */
	
	public static String reverseString(String orgString) {
		List<String> letters = Arrays.asList(orgString.split(""));
		Collections.reverse(letters);
		String reversed = "";
		for (String letter : letters) {
			reversed += letter;
		}
		return reversed;
	}
}
