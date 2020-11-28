package hall;

import abstraction.Menu;
import abstraction.MenuItem;
import iterators.PancakeMenuIterator;
import util.Iterator;

import java.util.ArrayList;

public class PancakeMenu implements Menu {
    ArrayList<MenuItem> menuItemArrayList;

    public PancakeMenu() {
        menuItemArrayList = new ArrayList<>();
        addItem("K&B's Pancake Breakfast");
        addItem("Regular Pancake Breakfast");
        addItem("Blueberry Pancakes");
        addItem("Waffles");
    }

    public void addItem(String newDes) {
        MenuItem item = new MenuItem(newDes);
        menuItemArrayList.add(item);
    }
    @Override
    public Iterator createIterator() {
        return new PancakeMenuIterator(menuItemArrayList);
    }
}
