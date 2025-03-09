package Behavioural.Strategy;

import Behavioural.Strategy.Contexts.Order;
import Behavioural.Strategy.Items.Item;
import Behavioural.Strategy.Strategies.CreditCardPaymentMethod;
import Behavioural.Strategy.Strategies.DeliveryPaymentMethod;
import Behavioural.Strategy.Strategies.PayPalPaymentMethod;

public class Client {
    public static void main(String[] args) {
        final var order = new Order(new DeliveryPaymentMethod());
        order.addItem(new Item("First Item", 10.0f));
        order.addItem(new Item("Second Item", 12.5f));
        order.pay();

        order.setPaymentMethod(new PayPalPaymentMethod());
        order.pay();

        order.setPaymentMethod(new CreditCardPaymentMethod());
        order.pay();
    }
}
