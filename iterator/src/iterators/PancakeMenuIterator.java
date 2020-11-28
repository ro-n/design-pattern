package iterators;

import abstraction.MenuItem;
import util.Iterator;

import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItemArrayList;
    int position = 0;

    public PancakeMenuIterator(ArrayList<MenuItem> menuItemArrayList) {
        this.menuItemArrayList = menuItemArrayList;
    }

    @Override
    public boolean hasNext() {
        return position < menuItemArrayList.size();
    }

    @Override
    public Object next() {
        MenuItem item = menuItemArrayList.get(position);
        position = position + 1;
        return item;
    }

    @Override
    public void remove() {
        menuItemArrayList.remove(position);
    }
}
