/*
1. Purpose Syntax & Usage: A method reference is described using :: (double colon) syntax.
    For example, System.out::println refers to the println method of the System.out object.
2. Functional Interfaces: They are used with functional interfaces.
3. Benefit: They make your code more readable and concise.
4. Limitation: They can only be used for methods that fit the parameters and return type.

Syntax:-
•Static Method References:
    ClassName::staticMethodName
•Instance Method:
    instance::instanceMethodName
•Instance Method Particular Class:
    ClassName::methodName
•Constructor References:
    ClassName::new

ex:- Lambda Expression              Method Reference
     s -> s.toLowerCase()           String::toLowerCase
     s.toLowerCase()                String::toLowerCase
(a,b) -> Person.compareByAge(a,b)   Person::compareByAge
 */

package FunctionalProgramming;
import java.util.List;
import java.util.function.BinaryOperator;

public class AK_08_MethodInterface {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,2,5,6,3);

        numbers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(System.out::println);

        numbers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(number -> System.out.println(number));

        int newSum2 = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.printf("\nSum using reduce is %d", newSum2);

        newSum2 = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.printf("\nSum using reduce is %d", newSum2);

    }
}
