package FunctionalProgramming;
import java.util.stream.IntStream;

public class AK_11_PracticeSet {
    public static void main(String[] args) {
        System.out.println("Factorial using two ways");
        int n = 5;
        System.out.println(factorial(n));

        IntStream.rangeClosed(2, n)
//                .forEach(System.out::println);
                .reduce((a, b) -> a * b)
                .ifPresent(System.out::println);
    }

    public static int factorial(int num) {
        if(num==1 || num==0) {
            return 1;
        }
        int fact = 1;
        for(int i=2; i<=num; i++) {
            fact *= i;
        }
        return fact;
    }
}
