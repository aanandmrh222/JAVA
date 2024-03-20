/*
1. An interface is a completely "abstract class" that is used to group related methods with empty bodies.
2. we use "implements" keyword.
3. In interface only public abstract things declared but in abstraction private, protected are used.
4. Interfaces primarily declare abstract methods for implementation by classes.
5. A class can implement multiple interfaces, allowing for more flexible designs.
6. Interfaces can have default methods with implementation and static methods.
7. Interface methods are inherently public and abstract, except for default and static methods.
 */

interface Transport{
//    public abstract void getSetGo();
    void getSetGo();
}
public class AK_58_Interfaces {
    public static void main(String[] args) {

    }
}





/*

// Interface

interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}



//Multiple Interfaces

interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class Main {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}

 */