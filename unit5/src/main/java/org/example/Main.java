package org.example;
import java.util.HashMap;
import java.util.Map;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("раз", 1);
        inputMap.put("два", 2);
        inputMap.put("три", 3);

        System.out.println("map: " + inputMap);
        Map<Integer, String> swappedMap = Task3.swapMap(inputMap);
        System.out.println("измененная map: " + swappedMap);
    }
}