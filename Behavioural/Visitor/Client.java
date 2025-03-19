package Behavioural.Visitor;

import Behavioural.Visitor.Models.Factory;
import Behavioural.Visitor.Models.Person;
import Behavioural.Visitor.Models.Shop;
import Behavioural.Visitor.PolicyManagers.HealthPolicyManager;
import Behavioural.Visitor.PolicyManagers.TheftPolicyManager;

public class Client {
    public static void main(String[] args) {
        final var factory = new Factory("1", "AB123", "Rome", "A1", 10);
        final var person = new Person("1", "AK123", "Mario", "Rossi");
        final var shop = new Shop("1", "AC123", "Rome", "Drug Store");

        final var theftPolicyManager = new TheftPolicyManager();
        final var healthPolicyManager = new HealthPolicyManager();

        factory.register(theftPolicyManager);
        factory.register(healthPolicyManager);
        person.register(healthPolicyManager);
        person.remove(healthPolicyManager);
        shop.register(theftPolicyManager);
    }
}
