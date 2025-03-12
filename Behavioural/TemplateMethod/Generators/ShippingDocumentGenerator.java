package Behavioural.TemplateMethod.Generators;

import Behavioural.TemplateMethod.User;

import java.time.LocalDate;

public class ShippingDocumentGenerator extends DocumentGenerator {
    private final User shipper;
    private final User recipient;

    public ShippingDocumentGenerator(User user, String place, LocalDate date, User shipper, User recipient) {
        super(user, place, date);
        this.shipper = shipper;
        this.recipient = recipient;
    }

    @Override
    protected boolean canGenerateShipperData() {
        return true;
    }

    @Override
    protected boolean canGenerateRecipientData() {
        return true;
    }

    @Override
    protected void generateBirthData() {
        throw new IllegalStateException("Cannot generate birth data!");
    }

    @Override
    protected void generateShipperData() {
        System.out.println("Shipper: " + this.shipper.getFirstName() + " " + this.shipper.getLastName());
    }

    @Override
    protected void generateRecipientData() {
        System.out.println("Recipient: " + this.recipient.getFirstName() + " " + this.recipient.getLastName());
    }
}
