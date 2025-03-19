package Behavioural.Visitor.Models;

import Behavioural.Visitor.PolicyManagers.PolicyManager;

public class Person extends Client {
    private String taxCode;
    private String firstName;
    private String lastName;

    public Person(String id, String taxCode, String firstName, String lastName) {
        super(id);
        this.taxCode = taxCode;
        this.firstName = firstName;
        this.firstName = lastName;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void register(PolicyManager policyManager) {
        policyManager.subscribe(this);
    }

    @Override
    public void remove(PolicyManager policyManager) {
        policyManager.unsubscribe(this);
    }
}
