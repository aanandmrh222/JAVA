import java.util.Scanner;

public class AK_28_ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter your "+ (i+1) + " element: ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }

    public static void arrayPrint(int[] array) {
        int i = 0;
        while (i<array.length) {
            System.out.print(array[i] + "  ");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = inputArray();
        arrayPrint(arr);
    }
}
