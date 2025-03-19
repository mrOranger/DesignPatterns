package Behavioural.Visitor.PolicyManagers;

import Behavioural.Visitor.Models.Client;
import Behavioural.Visitor.Policies.TheftPolicy;

public class TheftPolicyManager implements PolicyManager {

    @Override
    public void subscribe(Client client) {
        final var theftPolicy = new TheftPolicy("1", "A Theft Policy", "10000", 1000);

        client.getPolicies().add(theftPolicy);

        System.out.println("Registered new Theft Policy " + theftPolicy);
    }

    @Override
    public void unsubscribe(Client client) {
        final var theftPolicy = client.getPolicies()
                .stream()
                .filter((aPolicy) -> aPolicy instanceof TheftPolicy)
                .findFirst();

        client.getPolicies().remove(theftPolicy.orElseThrow());

        System.out.println("Removed Theft Policy " + theftPolicy);
    }
}
