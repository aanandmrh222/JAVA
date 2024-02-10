class Car {
    // Properties / Attribute / Instance Variables
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuel;
    int noOfSeats;


    // Instance Methods
    public Car start() {
        if(currentFuel==0) {
            System.out.println("Car is out of fuel, can not start");
        } else if(currentFuel<5) {
            System.out.println("Car is in reserved mode");
        } else {
            System.out.println("Car is started....");
        }
        return this;

    }
    public void drive() {
        currentFuel--;
        System.out.println("Car is driving");
    }

    public void addFuel(float fuel) {
        currentFuel += fuel;
    }
    public float getCurrentFuel() {
        return currentFuel;
    }


    public static void main(String[] args) {
        Car alto = new Car();
        alto.addFuel(6);

//        Car startedCar = alto.start();
//        startedCar.drive();

        alto.start().drive();
    }



}
