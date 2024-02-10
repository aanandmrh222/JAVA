public class AK_36_Car {
    // Properties / Attribute / Instance Variables
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuel;
    int noOfSeats;


    // Instance Methods
    public void drive() {
        if(currentFuel==0) {
        System.out.println("Car is out of fuel");
        } else if(currentFuel<5) {
            System.out.println("Car is in reserved mode");
            currentFuel--;
        } else {
            System.out.println("Car is driving");
            currentFuel--;
        }

    }
    public void addFuel(float fuel) {
        currentFuel += fuel;
    }
    public float getCurrentFuel() {
        return currentFuel;
    }



}
