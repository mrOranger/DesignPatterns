package Behavioural.Visitor.Policies;

public abstract class Policy {
    protected String id;
    protected String cost;
    protected String description;

    public Policy(String id, String description, String cost) {
        this.id = id;
        this.cost = cost;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Policy{" + "id='" + id + '\'' + ", cost='" + cost + '\'' + ", description='" + description + '\'' + '}';
    }
}
