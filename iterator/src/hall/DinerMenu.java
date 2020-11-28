package hall;

import abstraction.Menu;
import abstraction.MenuItem;
import iterators.DinerMenuIterator;
import util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT");
        addItem("BLT");
        addItem("Soup of the day");
        addItem("Hotdog");
        addItem("Steamed Veggies and Brown Rice");
        addItem("Pasta");
    }

    public void addItem(String newDes) {
        MenuItem item = new MenuItem(newDes);
        if (numOfItems == MAX_ITEMS) {
            System.out.print("Not Enough Space for Items");
        } else {
            menuItems[numOfItems] = item;
            numOfItems += 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
