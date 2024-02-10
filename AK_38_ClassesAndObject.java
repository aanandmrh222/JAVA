public class AK_38_ClassesAndObject {

    String name = "Aanand";
    String address = "Jalandhar";
    int age = 18;


    public static void main(String[] args) {

        AK_38_ClassesAndObject ex = new  AK_38_ClassesAndObject();
        AK_38_ClassesAndObject ex1 = new  AK_38_ClassesAndObject();
        System.out.println("Your name is: " + ex.name);
        System.out.println("Your address is: " + ex1.address);
        System.out.println("Your age is: " + ex.age);
        ex.age = 20;
        System.out.println("Your age is: " + ex.age);
        System.out.println("Your age is: " + ex1.age);


    }


}
