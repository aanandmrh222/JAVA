import java.util.Scanner;

public class AK_11_LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Logical Operators");
        System.out.println();

        System.out.println("Enter your details for ticket discount");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your gender(m/f): ");
        char gen = input.next().charAt(0);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if(age>=60 && gen=='m') {
                System.out.println("You are eligible for 30% discount");
        }
        else if((age>6) &&(age<=12)) {
            if ((gen=='m') || (gen=='f')){
                System.out.println("You are eligible for 25% discount");
            }
        }
        else if((age>12) && (age<60)) {
            if((gen=='m')) {
                System.out.println("You are eligible for 5% discount");
            }
            else if((gen=='f')) {
                System.out.println("You are eligible for 40% discount");
            }
        }
        else {
            System.out.println("Please Enter your correct details");
        }



    }
}
