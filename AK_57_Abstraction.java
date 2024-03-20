/*
Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces.
The abstract keyword is a non-access modifier, used for classes and methods:
    Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
    Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
    Abstract method: Defines methods without implementations, requiring subclasses to provide specific functionality.
 */

abstract class Vehicle1 implements Transport {
    private int noOfTires;

    public abstract void makeStartSound();

    @Override
    public void getSetGo() {
        System.out.println("This is from Transport");
    }

    public Vehicle1(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute() {
        System.out.println("Going");
    }
}

class Car2 extends Vehicle1{
    private int noOfDoors;
    public Car2() {
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Car start");
    }

//    @Override
//    public void getSetGo() {
//        System.out.println("This is from Transport");
//    }

}

public class AK_57_Abstraction {
    public static void main(String[] args) {
//        Vehicle1 veh = new Vehicle1(4);
        Car2 car = new Car2();
        car.commute();
        car.makeStartSound();
    }
}
