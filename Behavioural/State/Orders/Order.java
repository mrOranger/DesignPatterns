package Behavioural.State.Orders;

import Behavioural.State.Status.Status;
import Behavioural.State.Status.Working;
import Behavioural.State.Users.User;

public class Order {
    private User user;
    private Status status;

    public Order(User user) {
        this.user = user;
        this.status = Working.getInstance();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void work() {
        this.status.handle(this);
    }

    public void complete() {
        this.status.handle(this);
    }

    public void deliver() {
        this.status.handle(this);
    }
}
