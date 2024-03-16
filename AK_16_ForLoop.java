import java.util.Scanner;

public class AK_16_ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For Loop");
        System.out.println("Welcome to printing n natural number");
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        for(int i=1; i<=n; i++) {
            System.out.println(i);
        }

        System.out.println("For Each Loop");
        String[] arr = new String[] {
                "Ram", "Shyam", "Sohan", "Mohan", "Sita", "Gita"
        };
        System.out.println("----------");
        printArray(arr);
        System.out.println("----------");
        printArrayForEach(arr);
    }
    public static void printArray(String[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printArrayForEach(String[] array) {
        for(String name : array) {
            System.out.println(name);
        }
    }
}
