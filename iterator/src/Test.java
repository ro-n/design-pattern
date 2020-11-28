import hall.DinerMenu;
import hall.PancakeMenu;
import hall.Waitress;

public class Test {

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeMenu pancakeMenu = new PancakeMenu();
        Waitress waitress = new Waitress(dinerMenu, pancakeMenu);
        waitress.printMenu();
    }
}
