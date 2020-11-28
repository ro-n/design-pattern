package iterators;

import abstraction.MenuItem;
import util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0)
            throw new IllegalStateException();
        if (menuItems[position - 1] != null) {
            if (menuItems.length - 1 - position - 1 >= 0)
                System.arraycopy(menuItems, position - 1 + 1, menuItems, position - 1, menuItems.length - 1 - position - 1);
            menuItems[menuItems.length - 1] = null;
        }

    }
}
