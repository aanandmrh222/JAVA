import java.util.Scanner;

public class AK_13_BitwiseOperators {
    public static void main(String[] args) {
        System.out.println("Bitwise Operators");
        System.out.println("Bitwise AND operator:");
        System.out.println("12 & 13: "+(12&13));
        System.out.println("Bitwise OR operator:");
        System.out.println("12 | 3: "+(12|3));
        System.out.println("Bitwise XOR operator:");
        System.out.println("7 ^ 13: "+(7^13));
        System.out.println("Bitwise Compliment or NOT operator:");
        System.out.println("~ 13: "+ (~13));

        System.out.println("Bitwise Left Shift operator:");
        System.out.println("4 << 1: " +(4<<1));
        System.out.println("Bitwise Right Shift operator:");
        System.out.println("4 >> 1: " +(4>>1));


        System.out.println("Number Checking using bitwise operator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        if((a & 1) == 1) {
            System.out.println("The number a is odd");
        }
        else {
            System.out.println("The number a is even");
        }


    }
}
