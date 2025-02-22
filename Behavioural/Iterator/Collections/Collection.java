package Behavioural.Iterator.Collections;

import Behavioural.Iterator.Iterators.Iterator;

public interface Collection<T> {
    T get(int index);
    int length();
    void delete(int index);
    void push(T elem);
    Iterator<T> iterator();
}
