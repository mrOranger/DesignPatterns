package Behavioural.Strategy.Contexts;

import Behavioural.Strategy.Items.Item;
import Behavioural.Strategy.Strategies.PaymentMethod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Item> items;
    private PaymentMethod paymentMethod;

    public Order(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        this.items = new ArrayList<>();
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void deleteItem(Item item) {
        this.items.remove(item);
    }

    public void pay() {
        try {
            this.paymentMethod.pay(this);
        } catch (IllegalArgumentException | IOException exception) {
            System.err.println("Payment failed!");
            System.err.println(exception.getMessage());
        }
    }
}
