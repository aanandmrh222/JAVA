/*
this keyword refers to the current object in a method or constructor.
this keyword is to eliminate the confusion between class attributes and parameters with the same name
(because a class attribute is shadowed by a method or constructor parameter).

this can also be used to:
1. Invoke current class constructor
2. Invoke current class method
3. Return the current class object
4. Pass an argument in the method call
5. Pass an argument in the constructor call
*/


class Student1 {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public void printInfo(String name, int age) {
        this.name = name;
        this.age = age;

    }
}

public class AK_39_ThisKeyword {
    public static void main(String[] args) {

        Student1 st1 = new Student1();
        st1.name = "Aanand";
        st1.age = 18;
        st1.printInfo();

        Student1 st2 = new Student1();
        System.out.println(st2.name);
        System.out.println(st2.age);

        st2.printInfo("Ayush", 19);
        System.out.println(st2.name);
        System.out.println(st2.age);


    }
}
