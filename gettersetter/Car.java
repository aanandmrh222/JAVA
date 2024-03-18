package gettersetter;

public class Car {
    private String color;  // public
    private String model;  // public
    private double fuelLevel;
    private long costOfPurchase;  // default

    public Car() {

    }
    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "color='" + color + '\'' +
//                ", model='" + model + '\'' +
//                ", fuelLevel=" + fuelLevel +
//                ", costOfPurchase=" + costOfPurchase +
//                '}';
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.equals("Yellow")) {
            System.out.println("This color not allowed");
        } else {
            this.color = color;
        }
    }
    public String getModel() {
        return model;
    }
}
