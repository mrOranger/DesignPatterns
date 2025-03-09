package Behavioural.Strategy.Strategies;

import Behavioural.Strategy.Contexts.Order;
import Behavioural.Strategy.Items.Item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeliveryPaymentMethod implements PaymentMethod {
    private String address;
    private final BufferedReader reader;

    public DeliveryPaymentMethod() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void pay(Order order) throws IOException {
        System.out.println("-----Delivery-----");
        System.out.print("\n Address: ");
        this.address = this.reader.readLine();

        final var total = order.getItems().stream()
                .map(Item::getPrice)
                .reduce(Float::sum);

        System.out.println("Total: " + total);
    }
}
