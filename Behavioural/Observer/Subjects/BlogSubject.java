package Behavioural.Observer.Subjects;

import Behavioural.Observer.Notifications.Email;
import Behavioural.Observer.Observers.Observer;

import java.util.LinkedList;
import java.util.List;

public class BlogSubject implements Subject<Email> {
    private final List<Observer<Email>> observers;

    public BlogSubject() {
        this.observers = new LinkedList<>();
    }

    @Override
    public void subscribe(Observer<Email> observer) {
        if (!this.observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    @Override
    public void unsubscribe(Observer<Email> observer) {
        this.observers.remove(observer);
    }

    @Override
    public void next(Email message) {
        for (final Observer<Email> observer : this.observers) {
            observer.update(message);
        }
    }
}
