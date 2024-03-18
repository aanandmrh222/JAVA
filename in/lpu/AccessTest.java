package in.lpu;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "White";
        car.model = "BMW";
//        car.costOfPurchase = 12000000;     // not access because costOfPurchase is private
        System.out.println(car);

        Car newCar = new Car("Black", "BMW1", 5, 130000000);
        System.out.println(newCar);
    }
}
