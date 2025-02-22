package Behavioural.Iterator.Collections;

import Behavioural.Iterator.Iterators.Iterator;
import Behavioural.Iterator.Iterators.ListIterator;

public class ListCollection<T> implements Collection<T> {
    private Node<T> first;
    private int currentLength;

    public ListCollection() {
        this.first = null;
        this.currentLength = 0;
    }

    @Override
    public T get(int index) throws IllegalArgumentException {

        if (index > this.currentLength) {
            throw new IllegalArgumentException("Invalid index ...");
        }

        var currentNode = this.first;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.read();
    }

    @Override
    public int length() {
        return this.currentLength;
    }

    public void push(T elem) {
        if (this.length() == 0) {
            this.first = new Node<>(elem);
            this.first.setNext(null);
            this.currentLength = this.currentLength + 1;
            return;
        }

        var currentNode = this.first;
        for (int i = 0; i < this.length() - 1; i++) {
            currentNode = currentNode.getNext();
        }
        var newNode = new Node<>(elem);
        newNode.setNext(null);
        currentNode.setNext(newNode);
        this.currentLength = this.currentLength + 1;
    }

    @Override
    public void delete(int index) {
        if (index < this.currentLength) {
            throw new IllegalArgumentException("Invalid index ...");
        }

        var currentNode = this.first;
        var prevNode = currentNode;

        for (int i = 0; i < index; i++) {
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
        this.currentLength = this.currentLength - 1;
        prevNode.setNext(currentNode.getNext());
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>(this);
    }
}
