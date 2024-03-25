/*
1. Method overloading occurs when multiple methods in the same class
   have the same name but different parameter lists.
2. Parameter Difference: Overloaded methods must differ in the number,
   type, or sequence of their parameters.
3. Return Type: Can vary between overloaded methods, but the return
   type alone does not distinguish them.
4. Compile-Time Polymorphism: It's a form of polymorphism that is
   resolved during compile time.
 */

class Overloading {
    Overloading() {
        System.out.println("Default constructor called.");
    }
    // Overloading Constructor
    Overloading(String message) {
        System.out.println(message);
    }
}

class Dog1 {
    public void bark() {
        System.out.println("Woof ");
    }
    // Overloading method
    public void bark(int num) {
        for(int i=1; i<=num; i++) {
            System.out.println("Woof " + i);
        }
    }
}

public class AK_60_MethodOverloading {
    public int add(int a, int b) {
        return a+b;
    }
    // Overloading method
    public String add(String a, String b) {
        return a + b;
    }
    // Overloading method
    public int add(int a, int b, int c, int d) {
        return a+b+c+d;
    }

    public static void main(String[] args) {
        AK_60_MethodOverloading overload = new AK_60_MethodOverloading();
        int  sum = overload.add(5,6);
        String  sum1 = overload.add("5","6");
        int  sum2 = overload.add(5,6,4,5);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);

        Dog1 dog = new Dog1();
        dog.bark();
        dog.bark(3);

        Overloading overLoading = new Overloading();
        Overloading overLoading1 = new Overloading("Hey");
    }
}
