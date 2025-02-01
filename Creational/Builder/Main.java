package Creational.Builder;

import Creational.Builder.Builder.OrderBuilder;
import Creational.Builder.Director.OrderDirector;
import Creational.Builder.Order.Order;
import Creational.Builder.Product.Product;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        final OrderBuilder premiumOrderBuilder = OrderDirector.premiumOrderBuilder();
        final OrderBuilder standardOrderBuilder = OrderDirector.standardOrderBuilder();

        premiumOrderBuilder.setDeliveryCosts(0.1f);
        premiumOrderBuilder.setDestination("My House");
        premiumOrderBuilder.setProduct(new Product("AB123", "Bread", 1.0f));
        premiumOrderBuilder.setProduct(new Product("CD124", "Meat", 12.2f));
        premiumOrderBuilder.setDeliveryDate(LocalDate.now().plusDays(1));
        final Order premumOrder = premiumOrderBuilder.build();

        standardOrderBuilder.setDeliveryCosts(2.1f);
        standardOrderBuilder.setProduct(new Product("AB123", "Bread", 1.0f));
        standardOrderBuilder.setDeliveryDate(LocalDate.now().plusWeeks(3));
        final Order standardOrder = standardOrderBuilder.build();

        System.out.println("Premium Order: " + premumOrder);
        System.out.println("Standard Order: " + standardOrder);

    }


}
