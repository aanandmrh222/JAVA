/*
1. Offers methods like sort to sort lists.
2. Provides methods like binarySearch for searching sorted lists.
3. Allows reversing the order of elements in a list with reverse.
4. Can shuffle the elements of a list randomly using shuffle.
5. Creates unmodifiable collections using methods like unmodifiableList, etc.
6. Methods like singletonList, create immutable collections with a single element.
7. The copy method is used to copy all elements from one list to another.
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AK_74_CollectionsClass {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(12);
        numList.add(4);
        numList.add(76);
        numList.add(18);

        AK_71_UtilityClass.print(numList);
        Collections.sort(numList);
        System.out.println();
        AK_71_UtilityClass.print(numList);

        Collections.reverse(numList);
        System.out.println();
        AK_71_UtilityClass.print(numList);

        List<Integer> unmodifiable = Collections.unmodifiableList(numList);
        unmodifiable.add(99);
    }
}
