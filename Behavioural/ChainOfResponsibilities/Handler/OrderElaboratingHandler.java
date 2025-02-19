package Behavioural.ChainOfResponsibilities.Handler;

import Behavioural.ChainOfResponsibilities.Order.Order;
import Behavioural.ChainOfResponsibilities.Order.OrderStatus;

import java.time.LocalDate;

public class OrderElaboratingHandler extends OrderHandler {
    public OrderElaboratingHandler(OrderHandler orderHandler) {
        super(orderHandler);
    }

    @Override
    public void handle(Order order) {
        if (order.getStatus().equals(OrderStatus.ELABORATING)) {
            order.setElaboratingDate(LocalDate.now());
            System.out.println("Order is elaborating...");
            return;
        }

        this.handleNext(order);
    }
}
