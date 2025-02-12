package Structural.Decorator.Notifications;

import Structural.Decorator.Order;

public abstract class Notification implements Order {
    protected Order order;

    public Notification(Order order) {
        this.order = order;
    }
}
