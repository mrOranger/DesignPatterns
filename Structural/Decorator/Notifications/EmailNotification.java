package Structural.Decorator.Notifications;

import Structural.Decorator.Order;

public class EmailNotification extends Notification {
    public EmailNotification(Order order) {
        super(order);
    }

    @Override
    public void elaborate() {
        System.out.println("Sending an email notification ...");
        order.elaborate();
    }

    @Override
    public void deliver() {
        System.out.println("Sending an email notification ...");
        order.deliver();
    }

    @Override
    public void complete() {
        System.out.println("Sending an email notification ...");
        order.complete();
    }
}
