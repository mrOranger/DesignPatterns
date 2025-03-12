package Behavioural.TemplateMethod.Generators;

import Behavioural.TemplateMethod.User;

import java.time.LocalDate;

public class PrivacyPolicyGenerator extends DocumentGenerator {

    public PrivacyPolicyGenerator(User user, String place, LocalDate date) {
        super(user, place, date);
    }

    @Override
    protected boolean canGenerateBirthData() {
        return true;
    }

    @Override
    protected void generateBirthData() {
        System.out.println("Birth Place: " + user.getBirthPlace() + ", Birth Date: " + this.user.getBirthDate());
    }

    @Override
    protected void generateShipperData() {
        throw new IllegalStateException("Cannot generate shipper data!");
    }

    @Override
    protected void generateRecipientData() {
        throw new IllegalStateException("Cannot generate recipient data!");
    }
}
