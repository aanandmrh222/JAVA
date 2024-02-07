import java.util.Scanner;
public class AK_34_PracticeSet {
    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please Enter the number of columns: ");
        int columns = input.nextInt();
        int[][] array = new int[rows][columns];
        int i=0;
        while(i<rows) {
            int j=0;
            while(j<columns) {
                System.out.print("Please enter the element of row: "+(i+1) +" , and columns: "+(j+1)+" : ");
                array[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return array;
    }

    public static void printArray(int[][] array) {
        int i=0;
        while(i<array.length) {
            int j=0;
            while(j<array[i].length) {
                System.out.print(array[i][j]+ "  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }


    public static void elementFound(int ele, int[][] arr) {
        boolean found = false;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(ele==arr[i][j]) {
                    System.out.println("Your element is present at row " + (i + 1) + " and column " + (j + 1));
                    found = true;
                    break;      // Exit inner loop
                }
            }
            if(found) {
                break;       // Exit outer loop
            }
        }
        if(!found) {
            System.out.println("Your element is not present");
        }
    }


    public static int sum(int[][] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }


    public static double average(int[][] arr) {
        if(arr.length==0) {
            return 0;
        }
        int rows = arr.length;
        int cols = arr[0].length;
        int size = rows * cols;
        double sum = sum(arr);
        double avg = sum/size;
        return avg;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = input2DArray();
        System.out.println(" -- Here is your 2D array -- ");
        printArray(arr);
        System.out.println(" -- Element Search -- ");
        System.out.print("Enter a element you want to search: ");
        int ele = input.nextInt();
        elementFound(ele, arr);

        System.out.println(" -- Sum and Average of 2D Array -- ");
        int sum =sum(arr);
        System.out.println("Sum is "+sum);
        double avg = average(arr);
        System.out.println("Average is " + avg);

    }
}
