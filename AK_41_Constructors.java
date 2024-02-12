public class AK_41_Constructors {
    String color;
    float price;
    float maxSpeed;
    float currentFuel;
    int noOfSeat;

//    AK_41_Constructors() {     // Default constructor
//        color = "Black";
//        price = 500000;
//        maxSpeed = 180;
//        currentFuel = 2;
//        noOfSeat = 4;
//    }

    AK_41_Constructors(String color) {   // Parameterized constructor
//        color = color;        // color -> inside parameter
        this.color = color;     // this.color -> class color
        price = 100000;
        maxSpeed = 220;
        currentFuel = 2;
        noOfSeat = 5;
    }

    AK_41_Constructors() {     // Default constructor
        this("Black");
        currentFuel = 5;
    }


    public static void main(String[] args) {
        AK_41_Constructors alto = new AK_41_Constructors();
        System.out.println(alto.color);
        System.out.println(alto.price);
        System.out.println(alto.currentFuel);
        System.out.println(alto.noOfSeat);
        alto.noOfSeat = 8;
        System.out.println(alto.noOfSeat);


        AK_41_Constructors swift = new AK_41_Constructors("Red");
        System.out.println(swift.color);
        System.out.println(swift.price);
        System.out.println(swift.currentFuel);
        System.out.println(swift.noOfSeat);
        swift.noOfSeat = 6;
        System.out.println(swift.noOfSeat);

    }
}
