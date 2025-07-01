package org.example;

public class LinkedList {
    private static class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

    private Node head;
    private int size = 0;

    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node now = head;
            while (now.next != null)
                now = now.next;
            now.next = newNode;
        }
        size++;
    }

    public void add(int index, Object data) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node now = head;
            for (int i = 0; i < index - 1; i++)
                now = now.next;
            newNode.next = now.next;
            now.next = newNode;
        }
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Node now = head;
        for (int i = 0; i < index; i++)
            now = now.next;
        return now.data;
    }

    public void remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        if (index == 0) {
            head = head.next;
        } else {
            Node now = head;
            for (int i = 0; i < index - 1; i++)
                now = now.next;
            now.next = now.next.next;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}