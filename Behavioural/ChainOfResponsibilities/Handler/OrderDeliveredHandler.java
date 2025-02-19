package Behavioural.ChainOfResponsibilities.Handler;

import Behavioural.ChainOfResponsibilities.Order.Order;
import Behavioural.ChainOfResponsibilities.Order.OrderStatus;

import java.time.LocalDate;

public class OrderDeliveredHandler extends OrderHandler {
    public OrderDeliveredHandler(OrderHandler orderHandler) {
        super(orderHandler);
    }

    @Override
    public void handle(Order order) {
        if (order.getStatus().equals(OrderStatus.DELIVERED)) {
            order.setDeliveredDate(LocalDate.now());
            System.out.println("Order has been delivered...");
            return;
        }

        this.handleNext(order);
    }
}
