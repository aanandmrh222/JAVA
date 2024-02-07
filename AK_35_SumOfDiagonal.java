import java.util.Scanner;
public class AK_35_SumOfDiagonal {
    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please Enter the number of columns: ");
        int columns = input.nextInt();
        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Please enter the element of row " + (i + 1) + ", column " + (j + 1) + ": ");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }

    public static long diagonalSum(int[][] arr) {
        long leftSum = leftDiagonalSum(arr);
        long rightSum = rightDiagonalSum(arr);
        long sum1 = leftSum + rightSum;

        if (arr.length % 2 != 0) {
            int ind = arr.length/2;
            sum1 -= arr[ind][ind];    // middle element
        }
        return sum1;
    }

    public static long leftDiagonalSum(int[][] arr) {
        long sumL = 0;
        for (int i = 0; i < arr.length; i++) {
            sumL += arr[i][i];
        }
        return sumL;
    }

    public static long rightDiagonalSum(int[][] arr) {
        long sumR = 0;
        for (int i = 0; i < arr.length; i++) {
            int col = arr.length - 1 - i;
            sumR += arr[i][col];
        }
        return sumR;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int[][] arr = input2DArray();

        int arr[][] = AK_34_PracticeSet.input2DArray();
        long sum1 = diagonalSum(arr);
        System.out.println("Sum of diagonal elements is " + sum1);
        System.out.println();

    }
}
