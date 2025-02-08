package Structural.Bridge;

import Structural.Bridge.Abstraction.GoldAccount;
import Structural.Bridge.Abstraction.PremiumAccount;
import Structural.Bridge.Implementation.RegularSubscription;
import Structural.Bridge.Implementation.TrialSubscription;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        var premiumAccount = new PremiumAccount("john@example.com", "password123");
        var goldAccount = new GoldAccount("john@example.com", "password123");

        var regularSubscription = new RegularSubscription(LocalDate.now().minusDays(1), LocalDate.now().plusYears(1));
        var trialSubscription = new TrialSubscription(LocalDate.now().plusDays(30));


        try {

            premiumAccount.setSubscription(regularSubscription);
            goldAccount.setSubscription(trialSubscription);

            premiumAccount.login("john@example.com", "password123");
            premiumAccount.doSomething();
            premiumAccount.doSomething();

            goldAccount.login("john@example.com", "password123");
            goldAccount.doSomething();
            goldAccount.doSomething();
            goldAccount.doSomething();
            goldAccount.doSomething();
            goldAccount.doSomething();
            goldAccount.doSomething();
        } catch (IllegalStateException exception) {
            System.err.println(exception.getMessage());
        } finally {
            System.out.println("Changing Subscription to Regular");
            goldAccount.setSubscription(new RegularSubscription(
                    LocalDate.now().minusDays(1),
                    LocalDate.now().plusWeeks(2))
            );
            goldAccount.doSomething();
            goldAccount.doSomething();
        }

    }

}