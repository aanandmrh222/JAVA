import java.util.Scanner;

public class AK_07_ArithmeticOperators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Arithmetic Operators");
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();
        System.out.println("The sum of a and b is: "+(a+b));
        System.out.println("The difference of a and b is: "+(a-b));
        System.out.println("The multiplication of a and b is: "+(a*b));
        System.out.println("The division of a and b is: "+(a/b));
        System.out.println("The modulus of a and b is: "+(a%b));


        double x = 5;
        double y = 2;
        System.out.println();
        System.out.println("The sum of x and y is: "+(x+y));
        System.out.println("The difference of x and y is: "+(x-y));
        System.out.println("The multiplication of x and y is: "+(x*y));
        System.out.println("The division of x and y is: "+(x/y));
        System.out.println("The modulus of x and y is: "+(x%y));


        System.out.println("Shorthand Operator");
        int a1 = 5;
        int x1 = input.nextInt();
        a1 += x1;
        System.out.println(a1);
        int x2 = input.nextInt();
        a1 += x2;
        System.out.println(a1);
        int x3 = input.nextInt();
        a1 += x3;
        System.out.println(a1);
        int x4 = input.nextInt();
        a1 += x4;
        System.out.println(a1);


        System.out.println("Unary Operator");
        int p = 5;
        System.out.println(p--);
        System.out.println(p);
        System.out.println(p++);
        System.out.println(++p);

    }
}
