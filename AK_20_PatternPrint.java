import java.util.Scanner;

public class AK_20_PatternPrint {

    public static void pattern1(int maxrow) {
        int rows = maxrow;
        while (rows>0) {
            int i = 0;
            while (i < rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }


    public static void pattern2(int maxrow) {
        int rows = maxrow;
        while (rows>0) {
            // For space
            int j = 0;
            while (j < rows-1) {
                System.out.print("  ");
                j++;
            }

            // For stars
            int i = 0;
            while (i <= (maxrow-rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" -- Print Patterns -- ");
        System.out.print("Please enter the no. of rows: ");
        int rows = input.nextInt();
        System.out.println("-----");
        pattern1(rows);
        System.out.println("-----");
        pattern2(rows);

    }
}
