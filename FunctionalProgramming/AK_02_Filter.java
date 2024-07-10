/*
1. Purpose: Used to filter elements of a stream based on a given
    predicate (a condition). Only elements that satisfy the
    condition are included in the resulting stream.
2. Lazy Operation: It's a lazy operation, meaning it's not executed until a
    terminal operation (like collect or forEach) is invoked on the stream.
3. Returns a Stream: filter itself returns a new stream with
    elements that match the predicate.
 */

package FunctionalProgramming;
import java.util.List;
import java.util.function.Consumer;

public class AK_02_Filter {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "mango", "guava", "cherry");
        System.out.println(fruits.size());

        System.out.println("---- Printing Fruits normally ----");
        for(String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        System.out.println("---- Printing Fruits using streams ----");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.print(fruit + " ");
            }
        });
        System.out.println();


        System.out.println("---- Printing Fruits using filter ----");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("a"))   // it return boolean
                .forEach(fruit -> System.out.print(fruit + " "));
    }
}
