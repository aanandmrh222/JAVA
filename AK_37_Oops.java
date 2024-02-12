class Pen {
    // Properties / Attribute / Instance Variables
    String color;
    String type;   // ballpoint, gel

    // Instance Methods
    public void write() {
        System.out.println("Writing something");
    }
    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
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

public class AK_37_Oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel Pen";

        pen1.write();
//        System.out.println(pen1.color);

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ballpoint Pen";

        pen1.printColor();
        pen2.printColor();

        Student st1 = new Student();
        st1.name = "Aanand";
        st1.age = 18;
        st1.printInfo();

        Student st2 = new Student();
        st2.printInfo("Ayush", 19);
        System.out.println(st2.name);
        System.out.println(st2.age);


    }
}
