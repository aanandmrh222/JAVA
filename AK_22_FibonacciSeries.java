import java.util.Scanner;
public class AK_22_FibonacciSeries {

    public static void fibonacci(int num) {
        if(num<0) return;
        System.out.print("0 ");
        if(num==0) return;
        System.out.print("1 ");
        int first = 0, second = 1;
        int i = 0;
        while((first+second)<=num) {
            int third = first + second;
            System.out.print(third+" ");
            int temp = first;
            first = second;
            second = third;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" -- Fibonacci Series -- ");
        System.out.print("Enter a number up to which series has to be printed: ");
        int num = input.nextInt();
        System.out.print("Here is the Fibonacci Series: ");
        fibonacci(num);

    }
}
