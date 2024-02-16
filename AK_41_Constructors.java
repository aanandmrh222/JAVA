class Student2 {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Default Constructor
    Student2() {
        System.out.println("Constructor called");
    }

    // Parameterized constructor
    Student2(String name, int age) {
//        name = name;          // name -> for parameter
        this.name = name;       // this.name -> for Student2 class
        this.age = age;
    }

    // Copy constructors
    Student2(Student2 s3) {
        this.name = s3.name;
        this.age = s3.age;
    }
}

public class AK_41_Constructors {
    public static void main(String[] args) {

        // This is for Default Constructor
        Student2 s1 = new Student2();
        s1.name = "Aanand";
        s1.age = 18;
        s1.printInfo();

        // This is for Parameterized Constructor
        Student2 s2 = new Student2("Ayush", 18);
        s2.printInfo();

        // This is for Copy Constructor
        Student2 s3 = new Student2(s1);
        s3.printInfo();


    }
}