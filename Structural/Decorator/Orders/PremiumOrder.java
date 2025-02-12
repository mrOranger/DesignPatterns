package Structural.Decorator.Orders;

import Structural.Decorator.Order;

public class PremiumOrder implements Order {

    @Override
    public void elaborate() {
        System.out.println("I'm elaborating a PREMIUM order");
    }

    @Override
    public void deliver() {
        System.out.println("I'm delivering a PREMIUM order");
    }

    @Override
    public void complete() {
        System.out.println("I'm completing a PREMIUM order");
    }
}
