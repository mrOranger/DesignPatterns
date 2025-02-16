package Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private static final List<Product> products = new ArrayList<>();
    private static final FeatureFactory featureFactory = new FeatureFactory();

    public static void main(String[] args) {

        System.out.println(Client.indexProducts());
        Client.addProduct("AB123", "Pill","Red", "Small");
        Client.addProduct("AK184", "Pill","Green", "Small");
        Client.addProduct("AL101", "Pill","Blue", "Medium");
        Client.addProduct("AA190", "Pill","Gray", "Small");
        Client.addProduct("AU152", "Pill","Red", "Small");
        Client.addProduct("AZ424", "Pill","Red", "Large");

        System.out.println(Client.indexProducts());

        Client.removeProduct("AU152");

        Client.addProduct("LAK1231ka", "Pill","Red", "Small");

        System.out.println(Client.indexProducts());
    }

    public static List<Product> indexProducts() {
        return Client.products;
    }

    public static Product readProduct(String code) {
        for (Product product : Client.products) {
            if (product.getCode().equals(code)) {
                return product;
            }
        }

        throw new IllegalStateException("Product " + code + " not found");
    }

    public static void addProduct(String code, String form, String color, String size) {
        final var feature = Client.featureFactory.getFeature(form, color, size);
        final var newProduct = new Product(code, feature);
        Client.products.add(newProduct);
    }

    public static void removeProduct(String code) {
        final var product = Client.readProduct(code);
        Client.products.remove(product);
    }
}
