import java.util.Scanner;
public class AK_27_PracticeSet {
    public static long sum(int[] arr) {
        int i = 0;
        long sum = 0;
        while(i<arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] arr) {
        double sum = sum(arr);
        return (sum/arr.length);
    }

    public static int noOfOccurrences(int a,int[] arr) {
        int i = 0;
        int counter = 0;
        while(i<arr.length) {
            if(a==arr[i]) {
                counter++;
            }
            i++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] array= AK_28_ArrayUtility.inputArray();

        long sum = sum(array);
        double avg = average(array);

        System.out.println("Sum of the elements in array is: " + sum);
        System.out.println("Average of the elements in array is: " + avg);

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a element which you want to find: ");
        int a = input.nextInt();

        int occ = noOfOccurrences(a, array);
        System.out.println("Occurrence of element "+a+" in array is " + occ +" times");

    }
}
