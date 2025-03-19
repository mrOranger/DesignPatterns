package Behavioural.Visitor.Models;

import Behavioural.Visitor.PolicyManagers.PolicyManager;

public class Shop extends Client {
    private String vatCode;
    private String place;
    private String activityType;

    public Shop(String id, String vatCode, String place, String activityType) {
        super(id);
        this.vatCode = vatCode;
        this.place = place;
        this.activityType = activityType;
    }

    public String getVatCode() {
        return vatCode;
    }

    public void setVatCode(String vatCode) {
        this.vatCode = vatCode;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
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
