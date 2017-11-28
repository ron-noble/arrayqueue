package com.deliveryninja;

import java.util.NoSuchElementException;
import java.util.Optional;

public class ArrayQueue<T> {

    Object[] array;
    Integer head = 0;
    Integer tail = null;

    public ArrayQueue(int size){
        array = new Object[size];
    }

    public T get(){
        if(tail == null){
            throw new NoSuchElementException();
        }

        int temp = tail;
        tail = increment(tail);

        System.out.println("Returning position " + temp);
        return (T) array[temp];
    }

    public void put(T value) {
        if(head.equals(tail)){
            throw new IllegalStateException("ArrayQueue is full");
        }

        System.out.println("Adding " + value + " at position " + head);
        array[head] = value;

        if(tail == null){
            tail = head;
        }

        head = increment(head);
    }

    private int increment(int value) {
        //Pointer is at the end of the array
        if(value == array.length - 1){
            return 0;
        } else {
            return value + 1;
        }
    }
}
