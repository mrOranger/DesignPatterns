package Behavioural.Visitor.Policies;

public class TheftPolicy extends Policy {
    private int maxCoverage;

    public TheftPolicy(String id, String description, String cost, int maxCoverage) {
        super(id, description, cost);
        this.maxCoverage = maxCoverage;
    }

    public int getMaxCoverage() {
        return maxCoverage;
    }

    public void setMaxCoverage(int maxCoverage) {
        this.maxCoverage = maxCoverage;
    }

    @Override
    public String toString() {
        return "TheftPolicy{" + "maxCoverage=" + maxCoverage + '}';
    }
}
