/*
1. Custom exceptions are user-defined exception classes that extend either
   Exception (for checked exceptions) or RuntimeException (for unchecked exceptions).
2. They are created to represent specific error conditions relevant to an application.
*/


class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        System.out.println(message);
    }
}

public class AK_64_CustomExceptions{
    public static void Vote(int age) throws InvalidAgeException {
        if(age<18) {
            throw new InvalidAgeException("Not eligible for vote");
        }
        else {
            System.out.println("You are eligible for voting");
        }
    }
    public static void main(String[] args) {
        try {
            Vote(10);
        }
        catch (Exception e) {
            System.out.println("From Exception "+e);
        }

    }
}
