package command;

import abstraction.Command;
import devices.Printer;

public class PrinterCommand implements Command {
    private Printer printer;

    public PrinterCommand(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void execute() {
        System.out.println(Thread.currentThread().getId() + " executing command of printer:");
        if (printer != null) printer.print();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
