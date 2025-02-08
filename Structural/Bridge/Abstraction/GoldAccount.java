package Structural.Bridge.Abstraction;

public class GoldAccount extends Account {

    public GoldAccount(String email, String password) {
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
