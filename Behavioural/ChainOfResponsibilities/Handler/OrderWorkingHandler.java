package Behavioural.ChainOfResponsibilities.Handler;

import Behavioural.ChainOfResponsibilities.Order.Order;
import Behavioural.ChainOfResponsibilities.Order.OrderStatus;

import java.time.LocalDate;

public class OrderWorkingHandler extends OrderHandler {
    public OrderWorkingHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Order order) {
        if (order.getStatus().equals(OrderStatus.WORKING)) {
            order.setWorkingDate(LocalDate.now());
            System.out.println("Order is in working...");
            return;
        }

        this.handleNext(order);
    }
}
