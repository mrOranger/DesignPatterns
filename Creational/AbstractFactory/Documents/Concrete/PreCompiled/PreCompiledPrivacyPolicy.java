package Creational.AbstractFactory.Documents.Concrete.PreCompiled;

import Creational.AbstractFactory.Documents.PrivacyPolicy;

public class PreCompiledPrivacyPolicy extends PrivacyPolicy {
    public PreCompiledPrivacyPolicy(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void print() {
        System.out.println("[Printing] Precompiled Privacy policy for " + this.firstName + " " + this.lastName);
    }

    public void download() {
        System.out.println("[Downloading] Precompiled Privacy policy for " + this.firstName + " " + this.lastName);
    }
}
