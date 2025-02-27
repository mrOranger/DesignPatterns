package Behavioural.Memento;

import java.util.LinkedList;
import java.util.List;

public class UserHistory {
    private final List<User.UserMemento> mementoList;

    public UserHistory() {
        this.mementoList = new LinkedList<>();
    }

    public void save(User.UserMemento memento) {
        this.mementoList.add(memento);
    }

    public User.UserMemento get() {
        if (!this.mementoList.isEmpty()) {
            final var memento = this.mementoList.get(this.mementoList.size() - 1);
            this.mementoList.remove(this.mementoList.size() - 1);
            return memento;
        }
        throw new IllegalArgumentException("Empty user's history");
    }
}
