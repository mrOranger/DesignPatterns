package Structural.Composite;

public class Pill implements Box {

    private final String name;
    private final String description;
    private final float price;

    public Pill(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public float amount() {
        return this.price;
    }

}
