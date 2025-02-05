package Structural.Adapter.Legacy;

import Structural.Adapter.MobilePayment;

public class LegacyMobilePayment implements LegacyPayment {

    private final MobilePayment mobilePayment;
    private String pin;
    private boolean isAuthenticated;

    public LegacyMobilePayment(MobilePayment mobilePayment) {
        this.mobilePayment = mobilePayment;
        this.isAuthenticated = false;
    }

    public void authenticate(String pin) throws IllegalStateException {
        if (this.isAuthenticated) {
            this.isAuthenticated = false;
            throw new IllegalStateException("Already Authenticated");
        }

        this.pin = pin;
        this.mobilePayment.connect();
        this.isAuthenticated = true;
    }

    public void pay() throws IllegalStateException {
        if(!this.isAuthenticated) {
            throw new IllegalStateException("Unauthenticated");
        }

        try {
            this.mobilePayment.checkIdentityAndPay(this.pin);
        } finally {
            this.isAuthenticated = false;
        }
    }
}
