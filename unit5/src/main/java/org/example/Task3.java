package org.example;
import java.util.*;

public class Task3 {
    public static <K,V> Map<V,K> swapMap(Map<K, V> input_map){
        Map<V, K> result_map = new HashMap<>();
        for(Map.Entry<K, V> entry: input_map.entrySet()){
            result_map.put(entry.getValue(), entry.getKey());
        }
        return result_map;
    }
}
