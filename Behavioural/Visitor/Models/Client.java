package Behavioural.Visitor.Models;

import Behavioural.Visitor.Policies.Policy;
import Behavioural.Visitor.PolicyManagers.PolicyManager;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {
    protected String id;
    protected final List<Policy> policies;

    public Client(String id) {
        this.id = id;
        this.policies = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    public abstract void register(PolicyManager policyManager);
    public abstract void remove(PolicyManager policyManager);
}
