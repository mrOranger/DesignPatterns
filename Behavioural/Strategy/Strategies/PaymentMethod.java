package Behavioural.Strategy.Strategies;

import Behavioural.Strategy.Contexts.Order;

import java.io.IOException;

public interface PaymentMethod {
    void pay(Order order) throws IOException;
}
