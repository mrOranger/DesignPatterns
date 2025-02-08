package Structural.Bridge.Implementation;

import java.time.LocalDate;

public class RegularSubscription implements Subscription {

    public LocalDate subscriptionDate;
    public LocalDate renewAt;

    public RegularSubscription(LocalDate subscriptionDate, LocalDate renewAt) {
        this.subscriptionDate = subscriptionDate;
        this.renewAt = renewAt;
    }

    @Override
    public void performSomething() throws IllegalStateException {
        if (!this.isAllowed()) {
            throw new IllegalStateException("Your Regular Subscription has been expired.");
        }
        System.out.println("Performing regular operation");
    }

    @Override
    public boolean isAllowed() {
        var today = LocalDate.now();
        return today.isBefore(this.renewAt) && today.isAfter(this.subscriptionDate);
    }
}
