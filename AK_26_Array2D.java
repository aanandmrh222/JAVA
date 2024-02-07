public class AK_26_Array2D {
    public static void main(String[] args) {
        System.out.println(" -- Diagonal and below diagonal element -- ");
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int row=0; row<arr.length; row++) {
            for(int column=0; column<arr[row].length; column++) {
                if(row>=column) {
                    System.out.print(arr[row][column] + "\t");
                }
                else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }



        System.out.println();
        System.out.println(" -- Printing only even number -- ");
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        for(int row=0; row<arr1.length; row++) {
            for(int column=0; column<arr1[row].length; column++) {
                if(arr[row][column]%2==0) {
                    System.out.print(arr[row][column] + "\t");
                }
                else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }



        System.out.println();
        System.out.println(" -- Replace -ve number -- ");
        int[][] arr2 = {{1,2,-3},{-4,-5,6},{-7,-8,9}};
        for (int row=0; row<arr2.length; row++) {
            for(int column=0; column<arr2[row].length; column++) {

                if(arr2[row][column]<0) {
                    System.out.print("*" + "\t");
                }

                else {
                    System.out.print(arr2[row][column] + "\t");
                }

            }
            System.out.println();
        }



        System.out.println();
        System.out.println(" -- Printing Sum of Row -- ");
        int[][] arr3 = {{1,2,3},{4,5,6},{7,8,9}};
        for(int row=0; row<arr3.length; row++) {
            int sum = 0;
            for(int column=0; column<arr3[row].length; column++) {
                sum += arr3[row][column];
            }
            System.out.println("Sum of "+ row+ " row is " +sum);
        }



        System.out.println();
        System.out.println(" -- Finding minimum element -- ");
        int[][] arr4 = {{1,2,3},{-4,5,6},{0,8,9}};
        int min = arr4[0][0];
        for(int row=0; row<arr4.length; row++) {
            for(int col=0; col<arr4[row].length; col++) {
                if(arr4[row][col] < min) {
                    min = arr4[row][col];
                }
            }
        }
        System.out.println("Minimum element is: "+ min);


    }
}