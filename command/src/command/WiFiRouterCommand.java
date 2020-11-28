package command;

import abstraction.Command;
import devices.WiFiRouter;

public class WiFiRouterCommand implements Command {
    private WiFiRouter router;

    public WiFiRouterCommand(WiFiRouter router) {
        this.router = router;
    }

    @Override
    public void execute() {
        System.out.println(Thread.currentThread().getId() + " executing command of router:");
        if (router != null) router.connect();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
