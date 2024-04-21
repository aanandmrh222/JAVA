/*
1. Provide a way to use primitive data types (int, char, boolean, etc.) as objects.
2. Automatic conversion between the primitive types and their corresponding wrapper classes.
3. Once created, the value of a wrapper object cannot be changed.
4. Utility Methods: Each wrapper class provides useful methods, like compareTo,
   valueOf, and parseXxx (e.g., parseInt for Integer).

1. Autoboxing: Automatic conversion of primitive types to their
   corresponding wrapper class objects.
2. Unboxing: Automatic conversion of wrapper class objects back to
   their respective primitive types.
 */

public class AK_70_WrapperClasses {
    public static void main(String[] args) {
        Integer first = Integer.valueOf(5);
        Integer first1 = Integer.valueOf("5");
        Integer first2 = 5;    // autoboxing
        System.out.println(first+first1+first2);
        int second = first2;  //  unboxing
        System.out.println(second);

        String s = "4";
        int a = Integer.parseInt(s);
        System.out.println(a+6);
    }
}
