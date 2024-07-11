/*
1. Creating Optional Objects: Optional.empty(),
    Optional.of(), Optional.ofNullable()
2. Checking Value Presence: isPresent() and ifPresent()
3. Default Values: orElse() and orElseGet()
4. Value Transformation: map()
5. Throwing Exception: orElseThrow()
 */

package FunctionalProgramming;
import java.util.List;
import java.util.Optional;

public class AK_09_OptionalClass {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,2,5,6,3);
//        List<Integer> numbers = List.of();
        Optional<Integer> newSum = numbers.stream()
                .reduce((a, b) -> a + b);
        if(newSum.isPresent()) {
            System.out.println(newSum.get());
        } else {
            System.out.println("List is empty");
        }
    }
}
