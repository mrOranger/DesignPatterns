package Behavioural.Visitor.Models;

import Behavioural.Visitor.PolicyManagers.PolicyManager;

public class Factory extends Client {
    private String vatCode;
    private String place;
    private String sector;
    private int totalEmployees;

    public Factory(String id, String vatCode, String place, String sector, int totalEmployees) {
        super(id);
        this.vatCode = vatCode;
        this.place = place;
        this.sector = sector;
        this.totalEmployees = totalEmployees;
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

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(int totalEmployees) {
        this.totalEmployees = totalEmployees;
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
