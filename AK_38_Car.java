class Car {
    // Properties / Attribute / Instance Variables
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuel;
    int noOfSeats;

    // Instance Methods
    public void addFuel(float fuel) {
        currentFuel += fuel;
    }

    public void drive() {
        if (currentFuel == 0) {
            System.out.println("Car is out of fuel");
        } else {
            System.out.println("Car is driving");
            currentFuel--;
        }
    }

    public float getCurrentFuel() {
        return currentFuel;
    }
}

public class AK_38_Car {
    public static void main(String[] args) {
        Car myCar = new Car();    // Object Creation using (new) word
        //  new AK_36_Car() -> Object   &    myCar -> address create, its store address of new AK_36_Car()
        //  AK_36_Car() -> Constructor
        // For accessing our class we use  -> myCar
        // Class is a blueprint; Objects are Real values

        myCar.addFuel(6);
        System.out.println("Current fuel is: " + myCar.currentFuel);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        System.out.println("Current fuel is: " + myCar.currentFuel);
        myCar.addFuel(3);
        System.out.println("Current fuel is: " + myCar.currentFuel);
    }
}
