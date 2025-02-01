package Creational.Builder.Order;

import Creational.Builder.Product.Product;
import Creational.Builder.Subscription.ClientSubscription;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private String destination;
    private float deliveryCosts;
    private LocalDate deliveryDate;
    private List<Product> products;
    private ClientSubscription subscription;

    public Order() {
        this.deliveryCosts = 0f;
        this.products = new ArrayList<>();
    }

    public Order(String destination, float deliveryCosts, LocalDate deliveryDate, ClientSubscription subscription) {
        this.destination = destination;
        this.deliveryCosts = deliveryCosts;
        this.deliveryDate = deliveryDate;
        this.subscription = subscription;
        this.products = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public float getDeliveryCosts() {
        return deliveryCosts;
    }

    public void setDeliveryCosts(float deliveryCosts) {
        this.deliveryCosts = deliveryCosts;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public ClientSubscription getSubscription() {
        return subscription;
    }

    public void setSubscription(ClientSubscription subscription) {
        this.subscription = subscription;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public float total() {
        return this.deliveryCosts + this.products.stream()
                .map(Product::getCost)
                .reduce(0f, Float::sum);
    }

    @Override
    public String toString() {
        return "Order{" +
                "destination='" + destination + '\'' +
                ", deliveryCosts=" + deliveryCosts +
                ", deliveryDate=" + deliveryDate +
                ", total=" + this.total() +
                ", subscription=" + subscription +
                '}';
    }
}
