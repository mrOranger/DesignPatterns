package Creational.Factory;

import Creational.Factory.Creator.Concrete.EliteUserFactory;
import Creational.Factory.Creator.Concrete.PremiumUserFactory;
import Creational.Factory.Creator.Concrete.StandardUserFactory;
import Creational.Factory.Creator.UserFactory;
import Creational.Factory.User.User;

public class Main {
    public static void main(String[] args) {
        final User standardUser = Main.create(new StandardUserFactory(), "Bart", "Simpson");
        final User premiumUser = Main.create(new PremiumUserFactory(), "Homer", "Simpson");
        final User eliteUser = Main.create(new EliteUserFactory(), "Lisa", "Simpson");

        System.out.println(standardUser);
        System.out.println(premiumUser);
        System.out.println(eliteUser);
    }

    private static User create(UserFactory factory, String firstName, String lastName) {
        final User user = factory.create();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user;
    }
}
