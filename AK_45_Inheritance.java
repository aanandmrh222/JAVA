/*
    In Java, it is possible to inherit attributes and methods from one class to another.
    We group the "inheritance concept" into two categories:
      1. superclass (parent) - the class being inherited from
      2. subclass (child) - the class that inherits from another class
    To inherit from a class, use the extends keyword

    Types of Inheritance :-
    1. Single Level Inheritance :-  [Base Class] ---> [Derived Class]
    2. Multi Level Inheritance  :-  [Base Class] ---> [Derived Class1] ---> [Derived Class2]
    3. Hierarchical Inheritance :-  Hierarchical inheritance is defined as the process of deriving more than one class from a base class.
            [Base Class]
                / \
               /   \
 [Derived Class]   [Derived Class]

    4. Hybrid Inheritance  ;-  Hybrid inheritance is a combination of simple, multiple inheritance and hierarchical inheritance.

    Multiple Inheritance are not allowed in java, but allow in c++

 */

class Shape {
    String color;
    public void area() {
        System.out.println("Display area");
    }
}

class Triangle extends Shape {
    public void area(float base, float height) {
        double area0 = (double) 1 /2 * (base * height);
        System.out.println(area0);
    }
}
class EquilateralTriangle extends  Triangle {
    public void area(float base, float height) {
        System.out.println((float) 1/2*base*height);
    }
}

// Hierarchical Inheritance
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}


public class AK_45_Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
        System.out.println(t1.color);
        t1.area();
        t1.area(10,5);

        EquilateralTriangle t2 = new EquilateralTriangle();
        t2.area();
        t2.area(10,10);

        Circle c1 = new Circle();
        c1.area();
        c1.area(14);


    }
}
