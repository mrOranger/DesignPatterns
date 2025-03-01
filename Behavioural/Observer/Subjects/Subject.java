package Behavioural.Observer.Subjects;

import Behavioural.Observer.Observers.Observer;

public interface Subject <T> {
    void subscribe(Observer<T> observer);
    void unsubscribe(Observer<T> observer);
    void next(T message);
}
