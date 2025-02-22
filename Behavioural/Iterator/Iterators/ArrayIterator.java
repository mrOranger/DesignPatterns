package Behavioural.Iterator.Iterators;

import Behavioural.Iterator.Collections.Collection;

public class ArrayIterator <T> implements Iterator<T> {
    private int currentIndex;
    private final Collection<T> collection;

    public ArrayIterator(Collection<T> collection) {
        this.currentIndex = 0;
        this.collection = collection;
    }

    @Override
    public T first() {
        return this.collection.get(0);
    }

    @Override
    public void next() {
        this.currentIndex = this.currentIndex + 1;
    }

    @Override
    public boolean isDone() {
        return this.currentIndex > this.collection.length() - 1;
    }

    @Override
    public T current() {
        return this.collection.get(this.currentIndex);
    }
}
