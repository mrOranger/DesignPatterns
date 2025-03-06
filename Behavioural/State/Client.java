package Behavioural.State;

import Behavioural.State.Orders.Order;
import Behavioural.State.Users.User;

public class Client {
    public static void main(String[] args) {
        final var order = new Order(new User("Mario", "Rossi"));
        order.work();
        order.complete();
        order.deliver();
    }
}
