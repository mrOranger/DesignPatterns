package Creational.Builder.Builder;

import Creational.Builder.Order.Order;
import Creational.Builder.Product.Product;

import java.time.LocalDate;

public interface OrderBuilder {
    void setDeliveryDate(LocalDate deliveryDate);
    void setDestination(String destination);
    void setDeliveryCosts(float deliveryCosts);
    void setProduct(Product product);
    Order build();
}
