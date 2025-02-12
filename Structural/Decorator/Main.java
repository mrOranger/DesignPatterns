package Structural.Decorator;

import Structural.Decorator.Notifications.EmailNotification;
import Structural.Decorator.Notifications.SMSNotification;
import Structural.Decorator.Notifications.WhatsAppNotification;
import Structural.Decorator.Orders.PremiumOrder;

public class Main {
    public static void main(String[] args) {
        final var firstOrder = new SMSNotification(
                new WhatsAppNotification(
                        new EmailNotification(
                                new PremiumOrder()
                        )
                )
        );

        final var secondOrder = new SMSNotification(
                new PremiumOrder()
        );

        firstOrder.elaborate();
        firstOrder.deliver();
        firstOrder.complete();

        secondOrder.elaborate();
        secondOrder.deliver();
    }
}
