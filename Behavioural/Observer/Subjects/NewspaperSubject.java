package Behavioural.Observer.Subjects;

import Behavioural.Observer.Observers.Observer;

import java.util.LinkedList;
import java.util.List;

public class NewspaperSubject implements Subject<String> {
    private final List<Observer<String>> observers;

    public NewspaperSubject() {
        this.observers = new LinkedList<>();
    }

    @Override
    public void subscribe(Observer<String> observer) {
        if (!this.observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    @Override
    public void unsubscribe(Observer<String> observer) {
        this.observers.remove(observer);
    }

    @Override
    public void next(String message) {
        for (final Observer<String> observer : this.observers) {
            observer.update(message);
        }
    }
}
