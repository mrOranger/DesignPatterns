package Behavioural.ChainOfResponsibilities.Handler;

import Behavioural.ChainOfResponsibilities.Order.Order;
import Behavioural.ChainOfResponsibilities.Order.OrderStatus;

import java.time.LocalDate;

public class OrderCanceledHandler extends OrderHandler {
    public OrderCanceledHandler(OrderHandler orderHandler) {
        super(orderHandler);
    }

    @Override
    public void handle(Order order) {
        if (order.getStatus().equals(OrderStatus.CANCELED)) {
            order.setCanceledDate(LocalDate.now());
            System.out.println("Order has been canceled...");
            return;
        }

        this.handleNext(order);
    }
}
