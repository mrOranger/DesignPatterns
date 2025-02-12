package Structural.Decorator.Notifications;

import Structural.Decorator.Order;

public class SMSNotification extends Notification {
    public SMSNotification(Order order) {
        super(order);
    }

    @Override
    public void elaborate() {
        System.out.println("Sending an SMS notification ...");
        order.elaborate();
    }

    @Override
    public void deliver() {
        System.out.println("Sending an SMS notification ...");
        order.deliver();
    }

    @Override
    public void complete() {
        System.out.println("Sending an SMS notification ...");
        order.complete();
    }
}
