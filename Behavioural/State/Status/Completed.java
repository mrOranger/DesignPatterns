package Behavioural.State.Status;

import Behavioural.State.Notifications.NotificationService;
import Behavioural.State.Orders.Order;

public class Completed implements Status {
    private static Status instance = null;

    private Completed() {}

    public static Status getInstance() {
        if (Completed.instance == null) {
            Completed.instance = new Completed();
        }
        return Completed.instance;
    }

    public void handle(Order order) {
        final var orderUser = order.getUser();

        NotificationService.send(orderUser, "Your order has been completed");
        order.setStatus(Delivered.getInstance());
    }
}
