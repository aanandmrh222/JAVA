import java.util.Scanner;

public class AK_14_WhileLoop {
    public static void main(String[] args) {
        System.out.println("While Loop");
        int a = 0;            // Initialization
        while(a <= 5) {       // Condition
            System.out.println("Hello World " + a);
            a = a + 1;             // Updating the condition
        }


        System.out.println("Table Printing");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number which you want to print a table: ");
        int b = input.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(b + " * " + i + " = " + (b*i));
            i += 1;
        }


        System.out.println("Reverse Counting");
        int count = 10;
        while(count>=0) {
            System.out.println(count);
            count--;
        }


        System.out.println(" -- * printing --");
        int rows = 0;

        while(rows < 5) {
            System.out.print("*");
            int columns = 0;
            while (columns < rows) {
                System.out.print(" *");
                columns++;
            }
            System.out.println();
            rows++;
        }


    }
}
