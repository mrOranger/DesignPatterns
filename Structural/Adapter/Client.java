package Structural.Adapter;

import Structural.Adapter.Legacy.LegacyMobilePayment;
import Structural.Adapter.Legacy.LegacyPayment;

public class Client {
    public static void main(String[] args) {
        final MobilePayment applePayment = new ApplePayment("AB123");
        final LegacyPayment legacyMobilePayment = new LegacyMobilePayment(applePayment);

        try {
            legacyMobilePayment.authenticate("AKS98D");
            legacyMobilePayment.pay();
            System.out.println("[Attempt 1]: Payment successful");
        } catch (IllegalStateException exception) {
            System.err.println("[Attempt 1]: Payment Failed");
            exception.printStackTrace();
        }

        try {
            legacyMobilePayment.authenticate("AB123");
            legacyMobilePayment.pay();
            System.out.println("[Attempt 2]: Payment Successful");
        } catch (IllegalStateException exception) {
            System.err.println("[Attempt 2]: Payment Failed");
            exception.printStackTrace();
        }

    }
}
