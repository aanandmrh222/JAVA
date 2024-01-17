import java.util.Scanner;

public class AK_10_RelationalOperators {
    public static void main(String[] args) {
        System.out.println("Relational Operators");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = input.nextInt();

        if(a>b) {
            System.out.println(a+" is greater than "+b);
        }
        else if(a<b) {
            System.out.println(a+" is less than "+b);
        }
        else if(a==b) {
            System.out.println(a+" is equal to "+b);
        }
        else if(a!=b) {
            System.out.println(a+" is not equal to "+b);
        }
        else if(a>=b) {
            System.out.println(a+" is greater than or equal to "+b);
        }
        else if(a<=b) {
            System.out.println(a+" is less than or equal to "+b);
        }



    }
}
