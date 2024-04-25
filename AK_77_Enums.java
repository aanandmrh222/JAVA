/*
1. Enums in Java: Special types for fixed sets of constants like days, colors.
2. Declaration: Use enum keyword, e.g., enum Color { RED, GREEN, BLUE; }.
3. Access: Access constants with dot syntax, e.g., Color.RED.
4. Features: Type-safe, readable, can have methods and fields.
5. Usage: Useful in switch statements and iterating with values() method
 */

enum Grade {
    A, B, C, D, E, F;
}

enum TrafficLight {
    RED("Stop"), YELLOW("Caution"), GREEN("Go");
    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }
}

public class AK_77_Enums {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;

//        TrafficLight color = TrafficLight.Black;  // Invalid only use RED, YELLOW, GREEN
//        color = "Black";   // Invalid

        System.out.println(color);

        TrafficLight color1 = TrafficLight.valueOf("RED");
        System.out.println(color1);

        Grade gd = Grade.B;
        System.out.println(gd);

        for(Grade value : Grade.values()) {
            System.out.print(value + "  ");
        }
    }
}
