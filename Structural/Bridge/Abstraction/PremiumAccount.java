package Structural.Bridge.Abstraction;

public class PremiumAccount extends Account {
    public PremiumAccount(String email, String password) {
        super(email, password);
    }

    @Override
    public void doSomething() throws IllegalStateException {
        if (!this.signIn) {
            throw new IllegalStateException("You are not sing in");
        }

        this.getSubscription().performSomething();
    }
}
