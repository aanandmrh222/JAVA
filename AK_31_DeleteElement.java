import java.util.Scanner;

public class AK_31_DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion\n");
        int[] numArr = AK_28_ArrayUtility.inputArray();
        System.out.print("Now, enter then number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new array");
        AK_28_ArrayUtility.arrayPrint(newArr);
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = AK_27_PracticeSet.noOfOccurrences(numToDelete, numArr);
        if (occ == 0) {
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
}