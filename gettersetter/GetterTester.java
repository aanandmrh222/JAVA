package gettersetter;

public class GetterTester {
    public static void main(String[] args) {
        Car car = new Car("Red","BMW",5,1000);
//        System.out.println(car);
        car.setColor("Yellow");
        System.out.printf("%s %s", car.getColor(), car.getModel());
    }
}
