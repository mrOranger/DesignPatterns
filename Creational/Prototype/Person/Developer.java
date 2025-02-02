package Creational.Prototype.Person;

public class Developer extends Employee {

    private String language;

    public Developer(String firstName, String lastName, Long id, String language) {
        super(firstName, lastName, id);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", id=" + super.getId() +
                ", language='" + language + '\'' +
                '}';
    }
}
