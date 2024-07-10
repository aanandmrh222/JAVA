package FunctionalProgramming;
import java.util.function.BinaryOperator;

public class AK_04_PracticeSet {
    public static void main(String[] args) {
        // Lambda Multiplication
        BinaryOperator<Integer> multi = (a, b) -> a * b;
        int result = multi.apply(4,5);
        System.out.println(result);
    }
}
