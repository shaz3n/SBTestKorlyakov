package org.example;

public class LinkedListGeneric<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private int size = 0;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null)
            head = newNode;
        else {
            Node<T> now = head;
            while (now.next != null)
                now = now.next;
            now.next = newNode;
        }
        size++;
    }

    public void add(int index, T data) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        Node<T> newNode = new Node<>(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> now = head;
            for (int i = 0; i < index - 1; i++)
                now = now.next;
            newNode.next = now.next;
            now.next = newNode;
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Node<T> now = head;
        for (int i = 0; i < index; i++)
             now = now.next;
        return now.data;
    }

    public void remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        if (index == 0)
            head = head.next;
        else {
            Node<T> now = head;
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
