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



/*

public :-- The code is accessible for all classes.
default :-- The class is only accessible by classes in the same package. This is used when you don't specify a modifier.
private :-- The code is only accessible within the declared(or same) class. But in Inheritance we use getter setter method to access the all private(parent class) things in child class.
protected :-- The code is accessible in the same package and subclasses. this is used in Inheritance.

 */