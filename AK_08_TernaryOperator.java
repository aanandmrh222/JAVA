import java.util.Scanner;

class TernaryOperator {
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

        System.out.println(" -- Welcome to minimum number finder -- ");
        TernaryOperator ternary = new TernaryOperator();
        int min = ternary.min(a,b);
        System.out.println("Minimum number is: " + min);

    }

    public int min(int num1, int num2) {
        return num1 < num2 ? num1:num2;

    }
}
