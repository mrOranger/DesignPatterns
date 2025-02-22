package Behavioural.    Iterator;

import Behavioural.Iterator.Collections.ArrayCollection;
import Behavioural.Iterator.Collections.ListCollection;

public class Client {
    public static void main(String[] args) {
        final var listCollection = new ListCollection<>();
        final var arrayCollection = new ArrayCollection<>();

        listCollection.push(1);
        listCollection.push(2);
        listCollection.push(3);
        listCollection.push(4);
        listCollection.push(5);
        listCollection.push(6);

        arrayCollection.push(7);
        arrayCollection.push(8);
        arrayCollection.push(9);
        arrayCollection.push(10);

        final var arrayCollectionIterator = arrayCollection.iterator();
        while(!arrayCollectionIterator.isDone()) {
            System.out.println("Array Collection " + arrayCollectionIterator.current());
            arrayCollectionIterator.next();
        }

        final var listCollectionIterator = listCollection.iterator();
        while(!listCollectionIterator.isDone()) {
            System.out.println("List Collection " + listCollectionIterator.current());
            listCollectionIterator.next();
        }
    }
}
