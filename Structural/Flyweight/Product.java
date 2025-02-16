package Structural.Flyweight;

public class Product implements Comparable<String>{

    private String code;
    private Feature feature;

    public Product(String code, Feature feature) {
        this.code = code;
        this.feature = feature;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    @Override
    public String toString() {
        final var stringBuilder = new StringBuilder();
        return stringBuilder.append("Code = " + this.code)
                .append("(" + this.feature.toString() + ")")
                .toString();
    }

    @Override
    public int compareTo(String code) {
        return this.code.compareTo(code);
    }
}
