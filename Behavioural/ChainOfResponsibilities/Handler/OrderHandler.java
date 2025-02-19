package Behavioural.ChainOfResponsibilities.Handler;

import Behavioural.ChainOfResponsibilities.Order.Order;

public abstract class OrderHandler {

    protected OrderHandler nextHandler;

    public OrderHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Order order);

    public void handleNext(Order order) {
        if (this.nextHandler != null) {
            this.nextHandler.handle(order);
        }
    }

}
