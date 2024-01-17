import java.util.Scanner;

public class AK_03_InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = input.nextLine();
        System.out.println("Good morning "+name);

        System.out.print("Enter Your Roll Number: ");
        int roll = input.nextInt();
        System.out.println("Your name is "+name);
        System.out.println("Your roll is "+roll);

    }
}


