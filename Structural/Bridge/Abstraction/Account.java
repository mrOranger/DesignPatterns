package Structural.Bridge.Abstraction;

import Structural.Bridge.Implementation.Subscription;

public abstract class Account {

    protected boolean signIn;
    protected final String email;
    protected final String password;
    protected Subscription subscription;

    public Account(String email, String password) {
        this.signIn = false;
        this.email = email;
        this.password = password;
    }

    public Subscription getSubscription() {
        return this.subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public abstract void doSomething();

    public void login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            this.signIn = true;
        }
    }

    public void logout() {
        this.signIn = false;
    }
}
