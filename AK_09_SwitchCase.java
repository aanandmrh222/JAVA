import java.util.Scanner;
public class AK_09_SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day in number: ");
        int day = input.nextInt();
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6:  // Fall through
//                System.out.println("Saturday");
//                break;
            case 7: System.out.println("Holiday");
                break;
            default: System.out.println("Invalid Day..");
        }


        System.out.print("Enter a day in number: ");
        int day1 = input.nextInt();
        String output = switch (day1) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
//            case 6 -> "Saturday";
//            case 7 -> "Sunday";
            case 6, 7 -> "Holiday";
            default -> "Invalid!!";
        };
        System.out.println(output);




    }
}
