package Creational.Builder.Product;

public class Product {

    private String code;
    private String name;
    private float cost;

    public Product(String code, String name, float cost) {
        this.code = code;
        this.name = name;
        this.cost = cost;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product [code=" + code + ", name=" + name + "]";
    }
}
