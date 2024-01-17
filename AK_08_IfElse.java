import java.util.Scanner;

public class AK_08_IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if(age==0) {
            System.out.println("Invalid age!!\nPlease, Enter your correct age");
        }
        else if (age<18) {
            System.out.println("Your age is less than 18\nSo, you can't drive");

        }
        else {
            System.out.println("Your age is greater than 18\nSo, you can drive");
        }



    }

}
