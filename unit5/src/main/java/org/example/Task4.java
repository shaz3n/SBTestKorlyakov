package org.example;
import java.io.*;
import java.util.*;


public class Task4 {
    public static void main(String[] args) {
        String path = "unit5/input.txt";
        Map<String, Integer> frequencyMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                String[] tokens = currentLine.toLowerCase().split(" ");

                for (String token : tokens) {
                    String cleaned = token.replaceAll("[^а-яА-ЯёЁ]", "");
                    if (!cleaned.isEmpty()) {
                        frequencyMap.put(cleaned, frequencyMap.getOrDefault(cleaned, 0) + 1);
                    }
                }
            }

        } catch (IOException ex) {
            System.out.println("не удалось прочитать файл: " + ex.getMessage());
        }

        TreeMap<String, Integer> sorted = new TreeMap<>(frequencyMap);

        System.out.println("Слова по частоте упоминания:");
        for (var pair : sorted.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }
}
