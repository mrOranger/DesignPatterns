package Structural.Flyweight;

import java.util.HashSet;
import java.util.Set;

public class FeatureFactory {
    private Set<Feature> features;

    public FeatureFactory() {
        this.features = new HashSet<>();
    }

    public Feature getFeature(String form, String color, String size) {
        for (Feature feature : this.features) {
            final var currColor = feature.getColor();
            final var currForm = feature.getForm();
            final var currSize = feature.getSize();

            if (color.equals(currColor) && form.equals(currForm) && size.equals(currSize)) {
                return feature;
            }

        }

        final var newFeature = new Feature(color, form, size);
        this.features.add(newFeature);
        System.out.println("Add a new feature!");
        return newFeature;
    }
}
