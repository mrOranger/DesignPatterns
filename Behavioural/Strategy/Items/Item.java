package Behavioural.Strategy.Items;

public class Item implements Comparable<Item> {
    private String name;
    private float price;

    public Item(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" + "name='" + name + '\'' + ", price=" + price + '}';
    }

    @Override
    public int compareTo(Item item) {
        return this.name.compareTo(item.getName());
    }
}
