package Behavioural.Iterator.Collections;

import Behavioural.Iterator.Iterators.ArrayIterator;
import Behavioural.Iterator.Iterators.Iterator;

public class ArrayCollection<T> implements Collection<T>{
    private final T[] elements;
    private int currentLength;

    public ArrayCollection() {
        this.currentLength = 0;
        this.elements = (T[])new Object[100];
    }
    @Override
    public T get(int index) throws IllegalArgumentException {
        if (this.currentLength > index) {
            return this.elements[index];
        }
        throw new IllegalArgumentException("Invalid index...");
    }

    @Override
    public int length() {
        return this.currentLength;
    }

    @Override
    public void delete(int index) {
        if (this.currentLength > index) {
            for (int i = index; i < this.length(); i++) {
                this.elements[i - 1] = this.elements[i];
            }
        }
        throw new IllegalArgumentException("Invalid index...");
    }

    @Override
    public void push(T elem) {
        if (this.length() == 0) {
            this.elements[0] = elem;
            this.currentLength = this.currentLength + 1;
            return;
        }

        this.elements[this.currentLength] = elem;
        this.currentLength = this.currentLength + 1;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<T>(this);
    }
}
