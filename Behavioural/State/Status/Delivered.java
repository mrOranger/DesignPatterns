package Behavioural.State.Status;

import Behavioural.State.Notifications.NotificationService;
import Behavioural.State.Orders.Order;

public class Delivered implements Status {
    private static Status instance = null;

    private Delivered() {}

    public static Status getInstance() {
        if (Delivered.instance == null) {
            Delivered.instance = new Delivered();
        }
        return Delivered.instance;
    }

    public void handle(Order order) {
        final var orderUser = order.getUser();

        NotificationService.send(orderUser, "Your order has been delivered");
        order.setStatus(Completed.getInstance());
    }
}
