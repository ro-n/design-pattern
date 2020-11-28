package abstraction;

import java.util.ArrayList;
import java.util.HashMap;

public interface Checkable {
	public abstract HashMap<String, ArrayList<Product>> checkComponents();
}
