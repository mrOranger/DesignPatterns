package Behavioural.TemplateMethod.Generators;

import Behavioural.TemplateMethod.User;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class DocumentGenerator {
    protected final User user;
    protected final String place;
    protected final LocalDate date;

    public DocumentGenerator(User user, String place, LocalDate date) {
        this.user = user;
        this.place = place;
        this.date = date;
    }

    public final void generate() {
        this.generateUserData();
        if (this.canGenerateBirthData()) {
            this.generateBirthData();
        }

        if (this.canGenerateShipperData()) {
            this.generateShipperData();
        }

        if (this.canGenerateRecipientData()) {
            this.generateRecipientData();
        }

        this.generateSignatureAndDate();
    }

    private void generateUserData() {
        System.out.println("User: " + this.user.getFirstName() + " " + this.user.getLastName());
    }

    private void generateSignatureAndDate() {
        System.out.println("Signature: " + this.place + " " + this.date.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }

    protected boolean canGenerateBirthData() {
        return false;
    }

    protected boolean canGenerateShipperData() {
        return false;
    }

    protected boolean canGenerateRecipientData() {
        return false;
    }

    protected abstract void generateBirthData();
    protected abstract void generateShipperData();
    protected abstract void generateRecipientData();
}
