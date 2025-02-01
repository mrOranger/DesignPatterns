package Creational.Builder.Builder.Concrete;

import Creational.Builder.Builder.OrderBuilder;
import Creational.Builder.Order.Order;
import Creational.Builder.Product.Product;
import Creational.Builder.Subscription.ClientSubscription;

import java.time.LocalDate;

public class PremiumOrderBuilder implements OrderBuilder {

    private final Order premiumOrder;

    public PremiumOrderBuilder() {
        this.premiumOrder = new Order();
        this.premiumOrder.setSubscription(ClientSubscription.PREMIUM);
    }

    @Override
    public void setDeliveryDate(LocalDate deliveryDate) {
        if (deliveryDate.isAfter(LocalDate.now().plusWeeks(1))) {
            throw new IllegalArgumentException("Delivery date must be at more 1 weeks from today.");
        }
        this.premiumOrder.setDeliveryDate(deliveryDate);
    }

    @Override
    public void setDestination(String destination) {
        this.premiumOrder.setDestination(destination);
    }

    @Override
    public void setDeliveryCosts(float deliveryCosts) {
        if (deliveryCosts > 1) {
            throw new IllegalArgumentException("Delivery costs cannot be more than 1$.");
        }
        this.premiumOrder.setDeliveryCosts(deliveryCosts);
    }

    @Override
    public void setProduct(Product product) {
        this.premiumOrder.addProduct(product);
    }

    @Override
    public Order build() {
        return this.premiumOrder;
    }
}
