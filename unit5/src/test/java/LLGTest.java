package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LLGTest{

    @Test
    public void testAddAndGet() {
        LinkedListGeneric<String> list = new LinkedListGeneric<>();
        list.add("Alpha");
        list.add("Beta");
        assertEquals(list.get(0), "Alpha");
        assertEquals(list.get(1), "Beta");
    }

    @Test
    public void testAddAtIndex() {
        LinkedListGeneric<String> list = new LinkedListGeneric<>();
        list.add("A");
        list.add("C");
        list.add(1, "B");
        assertEquals(list.get(1), "B");
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testInvalidAddIndex() {
        LinkedListGeneric<Integer> list = new LinkedListGeneric<>();
        list.add(10, 123); // ошибка
    }

    @Test
    public void testRemove() {
        LinkedListGeneric<String> list = new LinkedListGeneric<>();
        list.add("X");
        list.add("Y");
        list.remove(1);
        assertEquals(list.size(), 1);
        assertEquals(list.get(0), "X");
    }

    @Test
    public void testIsEmptyAndSize() {
        LinkedListGeneric<String> list = new LinkedListGeneric<>();
        assertTrue(list.isEmpty());
        list.add("Z");
        assertFalse(list.isEmpty());
        assertEquals(list.size(), 1);
    }
}