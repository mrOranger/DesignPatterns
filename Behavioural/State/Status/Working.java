package Behavioural.State.Status;

import Behavioural.State.Notifications.NotificationService;
import Behavioural.State.Orders.Order;

public class Working implements Status {
    private static Status instance = null;

    private Working() {}

    public static Status getInstance() {
        if (Working.instance == null) {
            Working.instance = new Working();
        }
        return Working.instance;
    }

    public void handle(Order order) {
        final var orderUser = order.getUser();

        NotificationService.send(orderUser, "Your order is working");
        order.setStatus(Completed.getInstance());
    }
}
