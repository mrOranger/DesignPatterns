package Behavioural.ChainOfResponsibilities;

import Behavioural.ChainOfResponsibilities.Handler.*;
import Behavioural.ChainOfResponsibilities.Order.Order;
import Behavioural.ChainOfResponsibilities.Order.OrderStatus;

public class Client {
    public static void main(String[] args) {
        final var order = new Order();

        final var canceledHandler = new OrderCanceledHandler(null);
        final var deliveredHandler = new OrderDeliveredHandler(canceledHandler);
        final var completedHandler = new OrderCompletedHandler(deliveredHandler);
        final var workingHandler = new OrderWorkingHandler(completedHandler);
        final var elaboratingHandler = new OrderElaboratingHandler(workingHandler);

        elaboratingHandler.handle(order); // Order is elaborating

        System.out.println(order.getElaboratingDate());

        order.setStatus(OrderStatus.CANCELED);

        elaboratingHandler.handle(order); // Order has been canceled

        System.out.println(order.getCanceledDate());
    }
}
