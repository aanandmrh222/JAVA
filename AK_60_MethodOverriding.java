/*
1. Method overriding occurs when a subclass (child class) provides a specific
   implementation for a method already defined in its superclass (parent class).
2. Run-Time Polymorphism: Overriding is a basis for runtime polymorphism,
   where the method call is determined by the object's type at runtime.
3. Superclass Reference: An overridden method can be called through a
   superclass reference holding a subclass object.
4. The method must have the same name as in the parent class.
5. The method must have the same parameter as in the parent class.
6. Same Signature: Overridden methods must have the same name, return type,
   and parameters as the method in the parent class.
 */


/*
      <-- Final Keyword -->
Final Variable ---> To Create constant variables
Final Methods ----> To prevent method overriding
Final Classes ----> To prevent Inheritance
Benefits --> Efficiency, Null Safety, Immutable Objects
 */


//final class Vehicle4 {
class Vehicle4 {
//    public final void start() {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car4 extends Vehicle4 {
    // @Override annotation informs the compiler that the element
    // is meant to override an element declared in a superclass(Parent).
    @Override   // annotation
    public void start() {
        System.out.println("Car is starting...");
    }
}

class Plane4 extends Vehicle4 {
//    @Override
    public void start() {
        super.start();
        System.out.println("Plane is starting...");
    }

}

public class AK_60_MethodOverriding {
    public static void main(String[] args) {
        Car4 car4 = new Car4();
        Plane4 plane4 = new Plane4();

        car4.start();
        plane4.start();
    }
}
