/*
Abstraction is achieved in 2 ways:-
  - Abstract class
  - Interface (Pure Abstraction)

---- Abstract class ----
1. An abstract class must be declared with an abstract keyword.
2. It can have abstract and non-abstract methods.
3. It cannot be instantiated.
4. It can have constructors and static methods also.
5. It can have final methods which will force the subclass not to change the body of the methods.
 */

abstract class Animal1 {
    Animal1() {
        System.out.println("You are creating a new Animal");
    }
    abstract void walk();
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse1 extends Animal1 {
    Horse1() {
        System.out.println("Creating a new Horse");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Hen1 extends Animal1 {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class AK_47_Abstraction {
    public static void main(String[] args) {
//        Horse1 horse1 = new Horse1();
//        Hen1 hen1 = new Hen1();
//        horse1.walk();
//        horse1.eat();
//        hen1.walk();
//        hen1.eat();

        Horse1 horse2 = new Horse1();
    }
}
