package com.deliveryninja;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class ArrayQueueTest {

    @Test
    public void addAndRemoveOneElement(){
        ArrayQueue<String> arrayQueue = new ArrayQueue<>(10);
        arrayQueue.put("a");

        assertEquals("a", arrayQueue.get());
    }

    @Test
    public void addAndRemoveTwoElements() {
        ArrayQueue<String> arrayQueue = new ArrayQueue<>(10);
        arrayQueue.put("a");
        arrayQueue.put("b");

        assertEquals("a", arrayQueue.get());
        assertEquals("b", arrayQueue.get());
    }

    @Test(expected = IllegalStateException.class)
    public void addElementsPastMaximum(){
        ArrayQueue<String> arrayQueue = new ArrayQueue<>(1);
        arrayQueue.put("a");
        arrayQueue.put("b");
    }

    @Test(expected = NoSuchElementException.class)
    public void getElementWhenEmpty(){
        ArrayQueue<String> arrayQueue = new ArrayQueue<>(10);
        arrayQueue.get();
    }

    @Test
    public void addElementsAndRetrieveThem(){
        ArrayQueue<String> arrayQueue = new ArrayQueue<>(3);
        arrayQueue.put("a");
        arrayQueue.put("b");
        arrayQueue.put("c");

        String valueA = arrayQueue.get();
        String valueB = arrayQueue.get();

        arrayQueue.put("d");
        arrayQueue.put("e");

        String valueC = arrayQueue.get();
        String valueD = arrayQueue.get();
        String valueE = arrayQueue.get();

        assertEquals("c", valueC);
        assertEquals("d", valueD);
        assertEquals("e", valueE);
    }

}
