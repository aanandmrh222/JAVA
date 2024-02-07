public class AK_17_Methods {

//     Functions / Methods

    public static void greeting(String name) {
        System.out.println("Good Morning " + name);
    }


    public static int add(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }


    public static int sub(int a, int b) {
        return (a-b);
    }


    public static void mul(int a, int b) {
        int d = a * b;
        System.out.println(d);
    }


    public static void main(String[] args) {
        System.out.println("-- Method Calling --");
        greeting("Aanand");
        System.out.println(add(5,6));
        System.out.println(sub(6,5));
        mul(2,5);
        System.out.println("-- Method Calling Complete --");
    }
}
