package org.example;
import java.io.*;
import java.util.*;


public class Task4 {
    public static void main(String[] args) {
        WordCounter counter = new WordCounter();
        counter.countWords("unit5/input.txt");
        counter.printSorted();
    }
}
