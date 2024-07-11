/*
1. sorted() orders the elements of a stream based on their
    natural order or a provided comparator.
2. distinct() filters out duplicate elements, ensuring that
    every element in the resulting stream is unique.
3. map() applies a function to each element of a stream, transforming
    them into a new stream of results based on the function logic.
 */

package FunctionalProgramming;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AK_14_SortDistinctMap {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,2,5,1,8,3);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);


        List<String> fruits = List.of("Banana", "Apple", "Mango", "Apple", "Grapes", "Banana");
        List<String> distinctFruits = fruits.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctFruits);


        List<String> words = List.of("Banana", "Apple", "Mango", "Apple", "Grapes", "Banana");
        List<String> uppercaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppercaseWords);
    }
}
