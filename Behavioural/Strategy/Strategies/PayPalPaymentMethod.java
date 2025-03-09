package Behavioural.Strategy.Strategies;

import Behavioural.Strategy.Contexts.Order;
import Behavioural.Strategy.Items.Item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayPalPaymentMethod implements PaymentMethod {
    private final BufferedReader reader;
    private String email;
    private String password;

    public PayPalPaymentMethod() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void pay(Order order) throws IOException {
        System.out.println("-----PayPal-----");
        System.out.print("\n Account Email: ");
        this.email = this.reader.readLine();

        System.out.print("\n Account Password: ");
        this.password = this.reader.readLine();

        this.validate();

        final var total = order.getItems().stream()
                .map(Item::getPrice)
                .reduce(Float::sum);

        System.out.println("Payment Completed! Total: " + total);
    }

    private void validate() {
        if (!this.email.equals(this.password)) {
            throw new IllegalArgumentException("Invalid PIN!");
        }
    }
}
