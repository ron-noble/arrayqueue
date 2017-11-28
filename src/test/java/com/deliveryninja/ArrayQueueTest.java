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

    @Test
    public void addElementsAndRetrieveThem10Elements(){
        ArrayQueue<String> arrayQueue = new ArrayQueue<>(10);
        arrayQueue.put("a");
        arrayQueue.put("b");
        arrayQueue.put("c");
        arrayQueue.put("d");
        arrayQueue.put("e");
        arrayQueue.put("f");
        arrayQueue.put("g");
        arrayQueue.put("h");
        arrayQueue.put("i");
        arrayQueue.put("j");

        String valueA = arrayQueue.get();
        String valueB = arrayQueue.get();

        assertEquals("a", valueA);
        assertEquals("b", valueB);

        arrayQueue.put("a");
        arrayQueue.put("b");

        String valueC = arrayQueue.get();
        String valueD = arrayQueue.get();
        String valueE = arrayQueue.get();
        String valueF = arrayQueue.get();
        String valueG = arrayQueue.get();
        String valueH = arrayQueue.get();
        String valueI = arrayQueue.get();
        String valueJ = arrayQueue.get();
        valueA = arrayQueue.get();
        valueB = arrayQueue.get();

        assertEquals("c", valueC);
        assertEquals("d", valueD);
        assertEquals("e", valueE);
        assertEquals("f", valueF);
        assertEquals("g", valueG);
        assertEquals("h", valueH);
        assertEquals("i", valueI);
        assertEquals("j", valueJ);

        assertEquals("a", valueA);
        assertEquals("b", valueB);
    }

    @Test
    public void addElementsAndRetrieveThem545(){
        ArrayQueue<String> arrayQueue = new ArrayQueue<>(10);

        for(int i = 0 ; i < 10 ; i++){
            arrayQueue.put("test");
        }

        for(int i = 0 ; i < 10 ; i++){
            arrayQueue.get();
        }

        for(int i = 0 ; i < 10 ; i++){
            arrayQueue.put("test");
        }



    }

}
