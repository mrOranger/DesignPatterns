package Creational.Prototype.Person;

import Creational.Prototype.Prototype.PersonPrototype;

public class Employee implements PersonPrototype {
    private String firstName;
    private String lastName;
    private Long id;

    public Employee(String firstName, String lastName, Long id) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public PersonPrototype clone() {
        return new Employee(this.getFirstName(), this.getLastName(), this.getId());
    }
}
