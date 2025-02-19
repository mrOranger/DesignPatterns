package Behavioural.ChainOfResponsibilities.Handler;

import Behavioural.ChainOfResponsibilities.Order.Order;
import Behavioural.ChainOfResponsibilities.Order.OrderStatus;

import java.time.LocalDate;

public class OrderCompletedHandler extends OrderHandler {
    public OrderCompletedHandler(OrderHandler orderHandler) {
        super(orderHandler);
    }

    @Override
    public void handle(Order order) {
        if (order.getStatus().equals(OrderStatus.COMPLETED)) {
            order.setCompletedDate(LocalDate.now());
            System.out.println("Order has been completed...");
            return;
        }

        this.handleNext(order);
    }
}
