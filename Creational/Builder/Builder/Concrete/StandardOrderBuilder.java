package Creational.Builder.Builder.Concrete;

import Creational.Builder.Builder.OrderBuilder;
import Creational.Builder.Order.Order;
import Creational.Builder.Product.Product;
import Creational.Builder.Subscription.ClientSubscription;

import java.time.LocalDate;

public class StandardOrderBuilder implements OrderBuilder {

    private final Order standardOrder;

    public StandardOrderBuilder() {
        this.standardOrder = new Order();
        this.standardOrder.setDestination("Nearest delivery point");
        this.standardOrder.setSubscription(ClientSubscription.STANDARD);
    }

    @Override
    public void setDeliveryDate(LocalDate deliveryDate) {
        if (deliveryDate.isBefore(LocalDate.now().plusWeeks(3))) {
            throw new IllegalArgumentException("Delivery date must be at least 3 weeks from today.");
        }
        this.standardOrder.setDeliveryDate(deliveryDate);
    }

    @Override
    public void setDestination(String destination) {
        throw new IllegalArgumentException("Destination cannot be setted in STANDARD subscriptions");
    }

    @Override
    public void setDeliveryCosts(float deliveryCosts) {
        if (deliveryCosts < 1) {
            throw new IllegalArgumentException("Delivery costs cannot be less than 1$.");
        }
        this.standardOrder.setDeliveryCosts(deliveryCosts);
    }

    @Override
    public void setProduct(Product product) {
        this.standardOrder.addProduct(product);
    }

    @Override
    public Order build() {
        return this.standardOrder;
    }
}

