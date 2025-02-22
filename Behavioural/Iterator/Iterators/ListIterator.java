package Behavioural.Iterator.Iterators;


import Behavioural.Iterator.Collections.Collection;

public class ListIterator<T> implements Iterator<T> {
    private int currentIndex;
    private final Collection<T> list;

    public ListIterator(Collection<T> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public T first() {
        return this.list.get(0);
    }

    @Override
    public void next() {
        this.currentIndex = this.currentIndex + 1;
    }

    @Override
    public boolean isDone() {
        return this.currentIndex > this.list.length() - 1;
    }

    @Override
    public T current() {
        return this.list.get(this.currentIndex);
    }
}
