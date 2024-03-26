/*
---- Interfaces ----
1. All the fields in interfaces are public, static and final by default.
2. All methods are public & abstract by default.
3. A class that implements an interface must implement all the methods declared in the interface.
4. Interfaces support the functionality of multiple inheritance.
 */

interface Animal2 {
    public void walk();

}

interface Herbivore {

}
class Hourse2 implements Animal2, Herbivore {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class AK_47_Interfaces {
    public static void main(String[] args) {

    }
}
