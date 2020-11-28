import command.PrinterCommand;
import command.WiFiRouterCommand;
import devices.Printer;
import devices.WiFiRouter;

public class Test {

    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool(15);
        Printer printer = new Printer();
        WiFiRouter router = new WiFiRouter();

        for (int i = 0; i < 20; i++) {
            pool.addCommand(new PrinterCommand(printer));
            pool.addCommand(new WiFiRouterCommand(router));
        }

        pool.shutdown();
    }
}
