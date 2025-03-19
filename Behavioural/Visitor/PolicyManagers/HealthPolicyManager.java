package Behavioural.Visitor.PolicyManagers;

import Behavioural.Visitor.Models.Client;
import Behavioural.Visitor.Policies.HealthPolicy;

public class HealthPolicyManager implements PolicyManager {
    @Override
    public void subscribe(Client client) {
        final var newPolicy = new HealthPolicy("1", "A new Health Policy", "1000");

        client.getPolicies().add(newPolicy);

        System.out.println("Registered new Health Policy " + newPolicy);
    }

    @Override
    public void unsubscribe(Client client) {
        final var healthPolicy = client.getPolicies()
                .stream()
                .filter((aPolicy) -> aPolicy instanceof HealthPolicy)
                .findFirst();

        client.getPolicies().remove(healthPolicy.orElseThrow());

        System.out.println("Removed Health Policy " + healthPolicy);
    }
}
