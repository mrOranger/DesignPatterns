package Behavioural.Visitor.Policies;

import java.util.Arrays;

public class HealthPolicy extends Policy {
    private String[] diseases;

    public HealthPolicy(String id, String description, String cost) {
        super(id, description, cost);
        this.diseases = new String[10];
    }

    public String[] getDiseases() {
        return diseases;
    }

    public void setDiseases(String[] diseases) {
        this.diseases = diseases;
    }

    @Override
    public String toString() {
        return "HealthPolicy{" + "diseases=" + Arrays.toString(diseases) + '}';
    }
}
