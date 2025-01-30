package Creational.AbstractFactory.Products.Concrete.Static;

import Creational.AbstractFactory.Products.PrivacyPolicy;


public class StaticPrivacyPolicy extends PrivacyPolicy {
    public StaticPrivacyPolicy(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void print() {
        System.out.println("[Printing] Static Privacy policy for " + this.firstName + " " + this.lastName);
    }

    public void download() {
        System.out.println("[Downloading] Static Privacy policy for " + this.firstName + " " + this.lastName);
    }
}
