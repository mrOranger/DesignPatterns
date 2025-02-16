package Structural.Proxy;

public class Customer implements Comparable<Customer>{
    private String id;
    private String firstName;
    private String lastName;

    public Customer(String id, String firstname, String lastName) {
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Customer customer) {
        return this.id.compareTo(customer.id);
    }

    @Override
    public String toString() {
        final var stringBuilder = new StringBuilder();
        return stringBuilder.append("(" + this.id + ", ")
                .append(this.firstName + ", ")
                .append(this.lastName + ")")
                .toString();
    }
}
