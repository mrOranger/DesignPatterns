package Behavioural.Iterator.Iterators;

public interface Iterator<T> {
    T first();
    void next();
    boolean isDone();
    T current();
}
