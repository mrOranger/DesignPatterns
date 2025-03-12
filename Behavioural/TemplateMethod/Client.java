package Behavioural.TemplateMethod;

import Behavioural.TemplateMethod.Generators.PrivacyPolicyGenerator;
import Behavioural.TemplateMethod.Generators.ShippingDocumentGenerator;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        final var privacyPolicyGenerator = new PrivacyPolicyGenerator(
                new User("Mario", "Rossi", "Roma", LocalDate.now()),
                "Roma",
                LocalDate.now()
        );

        final var shippingDocumentGenerator = new ShippingDocumentGenerator(
                new User("Mario", "Rossi", "Roma", LocalDate.now()),
                "Roma",
                LocalDate.now(),
                new User("Luigi", "Neri", "Milano", LocalDate.now()),
                new User("Francesco", "Rossi", "Bari", LocalDate.now())
        );

        privacyPolicyGenerator.generate();
        shippingDocumentGenerator.generate();
    }
}
