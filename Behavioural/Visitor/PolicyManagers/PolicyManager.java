package Behavioural.Visitor.PolicyManagers;

import Behavioural.Visitor.Models.Client;

public interface PolicyManager {
    void subscribe(Client client);
    void unsubscribe(Client client);
}
