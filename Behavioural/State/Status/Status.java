package Behavioural.State.Status;

import Behavioural.State.Orders.Order;

public interface Status {
    void handle(Order order);
}
