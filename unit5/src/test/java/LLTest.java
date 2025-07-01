package org.example;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class LLTest{
    @Test
    public void testAddAndGet() {
        LinkedList list = new LinkedList();
        list.add("X");
        list.add("Y");
        assertEquals(list.get(0), "X");
        assertEquals(list.get(1), "Y");
    }

    @Test
    public void testAddAtIndex() {
        LinkedList list = new LinkedList();
        list.add("A");
        list.add("C");
        list.add(1, "B");
        assertEquals(list.get(1), "B");
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testInvalidAddIndex() {
        LinkedList list = new LinkedList();
        list.add(3, "X"); // Ошибка, список пуст
    }

    @Test
    public void testRemove() {
        LinkedList list = new LinkedList();
        list.add("A");
        list.add("B");
        list.remove(0);
        assertEquals(list.get(0), "B");
    }

    @Test
    public void testSizeAndEmpty() {
        LinkedList list = new LinkedList();
        assertTrue(list.isEmpty());
        list.add("One");
        assertEquals(list.size(), 1);
        assertFalse(list.isEmpty());
    }
}