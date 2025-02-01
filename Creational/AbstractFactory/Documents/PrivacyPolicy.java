package Creational.AbstractFactory.Documents;

public abstract class PrivacyPolicy {
    protected final String firstName;
    protected final String lastName;

    public PrivacyPolicy(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void download();
    public abstract void print();
}
