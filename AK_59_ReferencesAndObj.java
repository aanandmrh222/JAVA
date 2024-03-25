/*
1. Upcasting:- Parent p = new Child();
    Converts subclass to superclass reference.
    Automatic and safe.
    Access only to superclass methods.
2. Downcasting:- Parent p = new Child(); OR Child c = (Child)p;
    Converts superclass to subclass reference.
    Manual and risky, needs instanceof check.
    Access to subclass-specific methods.
3. Usage:
    Upcasting for generalization in methods.
    Downcasting for specific subclass behaviors.
 */

interface Vehicle3 {
    void start();
//    public void start() {
//        System.out.println("Starting the vehicle");
//    }
}

class Car3 implements Vehicle3 {
    public int noOfDoors() {
        return 4;
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

class Plane3 implements Vehicle3 {
    @Override
    public void start() {
        System.out.println("Plane is taking off");
    }
}

public class AK_59_ReferencesAndObj {
    public static void main(String[] args) {
        Car3 c = new Car3();
//        Vehicle3 v = new Vehicle3();
        Plane3 p = new Plane3();

//        castTest(v);
        castTest(c);
        castTest(p);

//        Vehicle3 vCar = new Vehicle3();
//        Car3 cVehicle = new  Vehicle3();  // Throw Error
//        Car3 cVehicle = (Car3) new  Vehicle3();  // Manually

//        Object ref = new Car3();
//        Object ref1 = new Vehicle3();

    }

    private static void castTest(Vehicle3 veh) {
        veh.start();
//        Car3 cVehicle = (Car3) veh;
//        cVehicle.start();
//        cVehicle.noOfDoors();

        if( veh instanceof Car3) {

        }

    }
}
