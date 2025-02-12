package Structural.Decorator.Notifications;

import Structural.Decorator.Order;

public class WhatsAppNotification extends Notification {
    public WhatsAppNotification(Order order) {
        super(order);
    }

    @Override
    public void elaborate() {
        System.out.println("Sending a WhatsApp notification ...");
        order.elaborate();
    }

    @Override
    public void deliver() {
        System.out.println("Sending a WhatsApp notification ...");
        order.deliver();
    }

    @Override
    public void complete() {
        System.out.println("Sending a WhatsApp notification ...");
        order.complete();
    }
}
