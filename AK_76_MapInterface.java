/*
1. Stores data as key-value pairs.
2. Each key can map to at most one value.
3. Keys are unique, but multiple keys can map to the same value.
4. It is part of the Collections Framework but does not extend the Collection interface
 */

import java.util.HashMap;
import java.util.Map;

public class AK_76_MapInterface {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(4, "Grapes");
        map.put(3, "Orange");

        System.out.println("Size of map: " + map.size());
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));

        map.remove(4);
        System.out.println(map.get(4));

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        if(map.containsKey(4)) {
            System.out.println("Grapes is present");
        }
        else System.out.println("Grapes is not present");

        for (Integer key : map.keySet()) {
            System.out.printf("%d : %s\n", key, map.get(key));
        }



    }
}
