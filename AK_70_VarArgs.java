//1. Java's varargs allow methods to accept any number of arguments.
//2. Declared using an ellipsis (...), e.g., void method(int... nums).
public class AK_70_VarArgs {

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int sum1(int first, int second, int... a) {
        int sum = first+second;
        for(int i : a) {
            sum += i;
        }
        return sum;
    }

    public static void main(String... args) {
        System.out.println(sum(5,4));
        System.out.println(sum1(5,4));
        System.out.println(sum1(2,3,4,5,6));
    }
}
