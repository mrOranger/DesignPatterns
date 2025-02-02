package Creational.Prototype;

import Creational.Prototype.Person.Employee;
import Creational.Prototype.Person.Manager;
import Creational.Prototype.Person.Person;
import Creational.Prototype.Prototype.PersonPrototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {

        final Person person = new Person("Mario", "Rossi");
        final Employee employee = new Employee("Maria", "Verdi", 12L);
        final Manager manager = new Manager("Francesco", "Gialli", 13L, "HR");

        final List<PersonPrototype> hiredPeople = new ArrayList<>();
        hiredPeople.add(employee.clone());
        hiredPeople.add(manager.clone());

        final List<PersonPrototype> firedPeople = new ArrayList<>();
        firedPeople.add(person);

        for (PersonPrototype p : hiredPeople) {
            System.out.println(p.toString());
        }

        for (PersonPrototype p : firedPeople) {
            System.out.println(p.toString());
        }

        manager.setArea("Cyber Security");

        for (PersonPrototype p : hiredPeople) {
            System.out.println(p.toString());
        }
    }
}
