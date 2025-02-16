package Structural.Flyweight;

public class Feature {
    private String color;
    private String form;
    private String size;

    public Feature(String color, String form, String size) {
        this.color = color;
        this.form = form;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        final var stringBuilder = new StringBuilder();
        return stringBuilder.append("Color: " + this.color)
                .append(" ,size: " + this.size)
                .append(" ,form: " + this.form)
                .toString();
    }
}
