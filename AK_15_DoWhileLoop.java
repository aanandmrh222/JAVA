import java.util.Scanner;

public class AK_15_DoWhileLoop {
    public static void main(String[] args) {
        // In do while loop code will iterate at least one time
        System.out.println("Do While Loop");
        Scanner input = new Scanner(System.in);

//        System.out.print("Enter your age: ");
//        int age = input.nextInt();
//        while (age<0 || age>100) {
//            System.out.print("Enter your age: ");
//            age = input.nextInt();
//        }


        int age;
        do{
            System.out.print("Enter your age: ");
            age = input.nextInt();
        } while (age<0 || age>100);
        System.out.println("Your age is: "+ age);

    }
}
