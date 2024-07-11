package FunctionalProgramming;
import java.util.List;

public class AK_17_PracticeSet {
    public static void main(String[] args) {
        List<String> number = List.of("1","2","3","4","5");
        number.stream()
                .map(Integer::parseInt)
                .map(num -> Math.pow(num, 2))
                .reduce((a, b) -> a+b)
                .ifPresent(System.out::println);
    }
}
