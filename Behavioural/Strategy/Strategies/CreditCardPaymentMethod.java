package Behavioural.Strategy.Strategies;

import Behavioural.Strategy.Contexts.Order;
import Behavioural.Strategy.Items.Item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreditCardPaymentMethod implements PaymentMethod {
    private final BufferedReader reader;
    private String cardNumber;
    private String pin;

    public CreditCardPaymentMethod() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void pay(Order order) throws IOException {
        System.out.println("-----Credit Card-----");
        System.out.print("\n Card Number: ");
        this.cardNumber = this.reader.readLine();

        System.out.print("\n Card PIN: ");
        this.pin = this.reader.readLine();

        this.validate();

        final var total = order.getItems().stream()
                .map(Item::getPrice)
                .reduce(Float::sum);

        System.out.println("Payment Completed! Total: " + total);
    }

    private void validate() {
        if (!this.pin.equals(this.cardNumber)) {
            throw new IllegalArgumentException("Invalid PIN!");
        }
    }
}
