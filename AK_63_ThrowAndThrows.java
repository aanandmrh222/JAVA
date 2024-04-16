/*
    --- throw keyword(mostly used) ---
1. throw keyword is used to explicitly throw an exception.
2. Used to explicitly throw an exception from any method or block of code.
3. You can throw either a new instance of an exception or an existing exception object using throw.
4. Example: throw new ArithmeticException("Division by zero");
5. By using throw you cannot throw more than one exception.
   ex: throw new IOException("Connection failed!!")

    --- throws keyword ---
1. throws keyword is used to declare an exception.
2. Declares that a method may throw one or more exceptions.
3. Used in the method signature to indicate that the method might throw exceptions of specified types.
4. A method declared with throws requires the calling method to handle or further declare the exception.
5. By using throws you can declare multiple exception.
   ex: public void method() throws IOException, SQLException.

 */

import java.util.Scanner;


//class Throws {
//    public static void example() throws ArithmeticException {
//        int result = 36/0;
//    }
//    public static void main(String[] args) {
//        try {
//            example();
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }
//    }
//}


//class Throw {
//    public static void example() {
//        throw new ArithmeticException("divide by 0");
//    }
//    public static void main(String[] args) {
//        example();
//    }
//}



class Throw {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
//        checkAge(15); // Set age to 15 (which is below 18...)
        checkAge(18);
    }
}
