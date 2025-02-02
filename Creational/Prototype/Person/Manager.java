package Creational.Prototype.Person;

import Creational.Prototype.Prototype.PersonPrototype;

public class Manager extends Employee implements PersonPrototype {
    private String area;

    public Manager(String firstName, String lastName, Long id, String area) {
        super(firstName, lastName, id);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", id=" + super.getId() +
                ", area='" + area + '\'' +
                '}';
    }

    @Override
    public PersonPrototype clone() {
        return new Manager(this.getFirstName(), this.getLastName(), this.getId(), this.getArea());
    }
}
