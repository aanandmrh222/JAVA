// try catch finally

import java.util.Scanner;

public class AK_63_ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        try {
            int[] arr = new int[5];
            System.out.println("From array "+arr[3]);
            int res = first/second;
            System.out.printf("The result is %d", res);
        }
        catch (ArithmeticException exception) {
//            System.out.println("Divide by zero is not possible");
            System.out.printf("Error occur: %s",exception.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: "+ e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception error: "+e.getMessage());
        }
        catch (Throwable th) {
            System.out.println("Throwable error: "+ th.getMessage());
        }
        finally {
            System.out.println("\nFinally is here");
        }

    }
}
