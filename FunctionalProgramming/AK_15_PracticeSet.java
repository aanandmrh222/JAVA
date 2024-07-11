package FunctionalProgramming;
import java.util.List;
import java.util.stream.Collectors;

public class AK_15_PracticeSet {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,2,5,3,4,6,2,9);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(distinctNumbers);
    }
}
