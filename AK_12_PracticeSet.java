import java.util.Scanner;

public class AK_12_PracticeSet {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.println("For checking a number");
//        System.out.print("Enter a number: ");
//        int a = input.nextInt();
//        if(a>0) {
//            System.out.println("The number is positive");
//        }
//        else if(a<0) {
//            System.out.println("The number is negative");
//        }
//        else {
//            System.out.println("The number is zero");
//        }



//        System.out.println();
//        System.out.println("Checking number is odd or even");
//        System.out.print("Enter a number: ");
//        int b = input.nextInt();
//        if(b%2==0) {
//            System.out.println("The number is even");
//        }
//        else {
//            System.out.println("The number is odd");
//        }



//        System.out.println();
//        System.out.println("Greatest of the three numbers");
//        System.out.print("Enter the first number: ");
//        int first = input.nextInt();
//        System.out.print("Enter the second number: ");
//        int second = input.nextInt();
//        System.out.print("Enter the third number: ");
//        int third = input.nextInt();
//        if(first>second) {
//            if(first>third) {
//                System.out.println(first+" is greater");
//            }
//        }
//        else if(second>third) {
//            System.out.println(second+" is greater");
//        }
//        else {
//            System.out.println(third+" is greater");
//        }



//        System.out.println();
//        System.out.println("Marks grade");
//        System.out.print("Enter your percentage: ");
//        int percentage = input.nextInt();
//        if(percentage >= 90) {
//            System.out.println("Great, You have got A");
//        }
//        else if(percentage >= 75) {
//            System.out.println("Good, You have got B");
//        }
//        else if(percentage >= 60) {
//            System.out.println("You have got C, Work harder next time");
//        }
//        else if(percentage >= 30) {
//            System.out.println("You have got D, You seriously need to work harder");
//        }
//        else {
//            System.out.println("Sorry, You failed the test and you got a F");
//        }




        System.out.println();
        System.out.println("Leap Year");
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if(year%4==0 && year%100!=0) {
            System.out.println("This is leap year");
        }
        else if(year%400==0) {
            System.out.println("This is leap year");
        }
        else {
            System.out.println("This is not leap year");
        }


    }
}
