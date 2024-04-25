enum Day {
    MONDAY(true), TUESDAY(true), WEDNESDAY(true), THRUSDAY(true),
    FRIDAY(true), SATURDAY(false), SUNDAY(false);

    private final boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType() {
        return isWeekday ? "Weekday" : "Weekend";
    }
}

public class AK_79_PracticeSetEnum {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week:-");
        for(Day day : Day.values()) {
            System.out.print(day + " ");
        }

        System.out.println("\n-------------------------");

        for(Day d : Day.values()) {
            System.out.printf("%s : %s\n", d, d.getType());
        }
    }
}
