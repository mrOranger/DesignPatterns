package Structural.Bridge.Implementation;

import java.time.LocalDate;

public class TrialSubscription implements Subscription {

    public short allowedOperations;
    public LocalDate renewAt;

    public TrialSubscription(LocalDate renewAt) {
        this.allowedOperations = 5;
        this.renewAt = renewAt;
    }

    @Override
    public void performSomething() throws IllegalStateException {
        if (!this.isAllowed()) {
            throw new IllegalStateException("Your Trial Subscription has been expired.");
        }
        this.allowedOperations--;
        System.out.println("Performing regular operation");
    }


    @Override
    public boolean isAllowed() {
        var today = LocalDate.now();
        return today.isBefore(this.renewAt) && this.allowedOperations > 0;
    }
}
