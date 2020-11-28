package hall;

import abstraction.Menu;
import abstraction.MenuItem;
import util.Iterator;

public class Waitress {
    Menu dinerMenu;
    Menu pancakeMenu;

    public Waitress(DinerMenu newDinerMenu, PancakeMenu newPancakeMenu) {
        dinerMenu = newDinerMenu;
        pancakeMenu = newPancakeMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = dinerMenu.createIterator();
        Iterator dinerIterator = pancakeMenu.createIterator();

        printMenu(pancakeIterator);
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getDes() + "\n");
        }
    }
}
