abstract class Vehicle1 {
    private int noOfTires;

    public abstract void makeStartSound();

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
}

public class AK_57_Abstraction {
    public static void main(String[] args) {
//        Vehicle1 veh = new Vehicle1(4);
        Car2 car = new Car2();
        car.commute();
        car.makeStartSound();
    }
}
