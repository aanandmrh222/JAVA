import java.util.Scanner;

public class AK_33_MergeTwoSorted {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int i = 0;
        while(i<size) {
            System.out.print("Please enter your "+ (i+1) + " element: ");
            array[i] = input.nextInt();
            i++;
        }
        return array;
    }
    public static void displayArray(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            System.out.print(arr[i] + "  ");
            i++;
        }
        System.out.println();
    }



    public static int[] merge(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i=0, j=0, k=0;
        while(i<arr1.length || j<arr2.length) {
            if(j==arr2.length || (i<arr1.length && arr1[i]<arr2[j])) {
                newArr[k] = arr1[i];
                i++;
                k++;
            }
            else{
                newArr[k]=arr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        System.out.println(" -- Merging Two Sorted Arrays");
        int[] arr1 = inputArray();
        int[] arr2 = inputArray();

        int[] mergedArray = merge(arr1, arr2);
        System.out.println("Merged array is :- ");
        displayArray(mergedArray);

    }
}
