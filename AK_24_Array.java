import java.util.Scanner;

public class AK_24_Array {
    public static void main(String[] args) {
        System.out.println(" -- Arrays -- ");

        int[] arr = new int[5];                    //  Creating an empty array
        System.out.println("Length of arr is: " + arr.length);
        // ---- Array Traversal ----
        int index = 0;
        while(index<arr.length) {
            System.out.print(arr[index] + " ");
            index++;
        }
        System.out.println();
        arr[1] = 3;      // Initializtion
        System.out.println("arr[1] is: " + arr[1]);

        System.out.println(" ---------- ");

        int[] rollNo = {5,6,7,8,9,11,13,15};         //  Creating  and Initializing an array
        System.out.println("Length of array is: " + rollNo.length);
        System.out.println("Printing all elements of an array");
        // ---- Method for accessing an elements from the array ----
        for(int i=0; i<rollNo.length; i++) {
            System.out.print(rollNo[i] + " ");
        }
        int s = 0;
        for(int i=0; i<rollNo.length; i++) {
            s = s + rollNo[i];
        }
        System.out.println("\nSum of roll number is: " + s);
        System.out.println("rollNo[0]: "+ rollNo[0]);
        rollNo[0] = 10;
        System.out.println("rollNo[0]: "+ rollNo[0]);

        System.out.println(" ---------- ");

        int ar[] = {1,2,3,4,5,6};
        // -- For each loop --
        for(int var : ar) {
            System.out.print(var + " ");
        }
        int sum = 0;
        for(int a : ar) {
            sum = sum + a;
        }
        System.out.println("\nSum of array is: " + sum);

        System.out.println(" ---------- ");

        System.out.println("Searching an element in an array");
        int arrr[] = {56,74,2,36,5,44,0,11,27,99};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to search: ");
        int number = input.nextInt();

        boolean found = false;
        for(int i=0; i<arrr.length; i++) {
            if (arrr[i] == number) {
                System.out.println("Element present at index " + i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Element not present in array");
        }

        System.out.println(" ---------- ");

        String[] allName = {"Aanand", "Ayush", "Raushan", "Kishan", "Abhishek"};
        System.out.println(allName[0]);
        System.out.println("Length of array is: " + allName.length);
        String n = "Ayush";

        boolean isFound = isFound(allName, n);
        if(isFound) {
            System.out.println("Name is present in array");
        }
        else{
            System.out.println("Name is not present in array");
        }


    }
    public static boolean isFound(String[] allName, String name) {
        int index = 0;
        while (index<allName.length) {
            if(allName[index] == name) {
                return true;
            }
            index++;
        }
        return false;
    }
}
