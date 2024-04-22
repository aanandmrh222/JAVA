/*
1. Unique Elements: Does not allow duplicate elements.
2. Unordered Collection: it does not guarantee any specific ordering of elements.
3. No Positional Access: Unlike lists, it doesn't support indexing-based access to elements.
4. Implementation: Common implementations include HashSet, LinkedHashSet, and TreeSet(ordered collection).
*/

import java.util.HashSet;
import java.util.Set;

public class AK_73_SetInterface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Grapes");


        boolean isAdded = set.add("Apple");
        System.out.println("Apple added again: "+isAdded);

        boolean containsOrange = set.contains("Orange");
        System.out.println("Contains Orange: "+containsOrange);

        boolean containsApple = set.contains("Apple");
        System.out.println("Contains Apple: "+containsApple);

        AK_71_UtilityClass.print(set);

        set.remove("Grapes");
        System.out.println();
        AK_71_UtilityClass.print(set);
    }
}
