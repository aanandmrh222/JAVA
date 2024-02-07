public class AK_25_Array2D {
    public static void main(String[] args) {
        System.out.println("2D Array");

        int[][] numArr = new int[2][3];
        System.out.println(numArr.length);

        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(arr[1][0]);
        System.out.println("Length of arr " + arr.length);

        int i1 = 0;
        while (i1 < arr.length) {
            int j = 0;
            while (j < arr[i1].length) {
                System.out.print(arr[i1][j] + "\t");
                j++;
            }
            System.out.println();
            i1++;
        }

//        for(int row=0; row<arr.length; row++) {
//            for(int column=0; column<arr[row].length; column++) {
//                System.out.print(arr[row][column] + "    ");
//            }
//            System.out.println();
//        }



        int[][] arr1  = {{1,5,7},{5,8,9},{0,6,4}};
        System.out.println("\n1st and last row");
        for(int row=0; row<arr1.length; row++) {
            for(int column=0; column<arr1[0].length; column++) {
                if(row==0 || row == arr1.length-1) {
                    System.out.print(arr1[row][column] + "    ");
                }
            }
            System.out.println();
        }



        int[][] arr2 = {{1,2,3,1},{4,5,6,1},{7,8,9,1},{4,5,7,1}};
        System.out.println("\nOnly border element");
        for(int i=0; i<arr2.length; i++) {
            for(int j=0; j<arr2[i].length; j++) {
                if(i==0 || i==arr2.length-1 || j==0 || j==arr2[i].length-1){
                    System.out.print(arr2[i][j] + "    ");
                }
                else {
                    System.out.print("     ");
                }

            }
            System.out.println(" ");
        }



        int[][] arr3 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("\nOnly diagonal element");
        for(int i=0; i<arr3.length; i++) {
            for(int j=0; j<arr3[i].length; j++) {
                if(i==j) {
                    System.out.print(arr3[i][j] + "    ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
