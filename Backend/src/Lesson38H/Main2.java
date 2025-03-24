package Lesson38H;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Map<Integer, String> day = new HashMap<>();
        day.put(1, "Один");
        day.put(2, "Два");
        day.put(3, "Три");
        day.put(4, "Четыре");
        day.put(5, "Пять");
        
        day.forEach((key, value) -> System.out.println(key + " - " + value));
        
        List<Integer> keys = new ArrayList<>(day.keySet());

        Collections.sort(keys);
        System.out.println("sort:");
        keys.forEach(key -> System.out.println(key + " - " + day.get(key)));

        Collections.shuffle(keys);
        System.out.println("shuffle:");
        keys.forEach(key -> System.out.println(key + " - " + day.get(key)));

        int minKey = Collections.min(keys);
        int maxKey = Collections.max(keys);
        System.out.println("min: " + minKey + " - " + day.get(minKey));
        System.out.println("max: " + maxKey + " - " + day.get(maxKey));
    }
}
