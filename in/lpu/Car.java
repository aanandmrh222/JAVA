package in.lpu;

public class Car {
    public String color;
    public String model;
    private double fuelLevel;
    private long costOfPurchase;
//    long costOfPurchase;

//    Default Constructor
    public Car() {

    }
    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }

}
