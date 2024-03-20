/*

public :-- The code is accessible for all classes.
default :-- The class is only accessible by classes in the same package. This is used when you don't specify a modifier.
private :-- The code is only accessible within the declared(or same) class. But in Inheritance we use getter setter method to access the all private(parent class) things in child class.
protected :-- The code is accessible in the same package and subclasses. this is used in Inheritance.

 */

class Vehicle {
    //    public int numberOfTires;
//    private int numberOfTires;
    protected int numberOfTires;

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    @Override
    public String toString() {
        return "Number of vechile tires: " + numberOfTires;
    }

    public void commute() {
        System.out.printf("I am going from place A to place B using %d tires\n", numberOfTires);
    }
}

class Twowheeler extends Vehicle {
    protected Twowheeler() {
//        numberOfTires = 2;
//        setNumberOfTires(2);
        numberOfTires = 2;
    }
    public void balance() {
        System.out.println("I am balancing on two tires");
    }
}
class MotorCycle extends Twowheeler {
    public double petrolCapacity;
    public void start() {
        System.out.println("Motorcycle starting");
    }
}

public class AK_51_Inheritance {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());

        Twowheeler twowheeler = new Twowheeler();
        twowheeler.commute();
        twowheeler.balance();

        MotorCycle motor = new MotorCycle();
        motor.commute();
        motor.balance();
        motor.start();
    }
}