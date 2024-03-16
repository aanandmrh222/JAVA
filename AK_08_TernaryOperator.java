import java.util.Scanner;

public class AK_08_TernaryOperator {
    public static void main(String[] args) {
        System.out.println("Ternary Operator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();

        String c = a>b ? "A is greater":"B is greater";
        System.out.println(c);

        boolean bool = a==b? true : false;
        System.out.println(bool);

        int greaterNumber = a>b ? a : b;
        System.out.println(greaterNumber+" is greater number");

    }
}
