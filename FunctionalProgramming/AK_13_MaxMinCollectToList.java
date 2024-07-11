/*
1. max() finds the largest element in the stream according to a
    given comparator or natural ordering.
2. min() identifies the smallest element in the stream based on a
    provided comparator or natural ordering.
3. collect(Collectors.toList()) gathers all the elements of the
    stream into a new List.
 */

package FunctionalProgramming;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AK_13_MaxMinCollectToList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,2,5,1,8,3);

        Optional<Integer> maxNumber = numbers.stream()
                .max(Integer::compareTo);
        System.out.println(maxNumber);

        Optional<Integer> minNumber = numbers.stream()
                .min(Integer::compareTo);
        System.out.println(minNumber);

        List<String> fruits = Arrays.asList("Apple", "Mango", "Grapes", "Banana");
//        List<String> collectedFruits = new ArrayList<>(fruits);
        List<String> collectedFruits = fruits.stream()
                .collect(Collectors.toList());
        System.out.println(collectedFruits);
    }
}
