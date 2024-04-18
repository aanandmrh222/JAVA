import java.util.Scanner;

public class AK_36_StringsMethods {
    public static void main(String[] args) {

        System.out.println(" -- String Methods -- ");
        String str1 = "Hello!! How are you?";
        System.out.println(str1.length());
        System.out.println(str1.indexOf("you"));    //index of text
        System.out.println(str1.indexOf("r"));     //index of character

        String str4 = "   Rohan   ";
        System.out.println(str4);
        System.out.println(str4.trim());
        System.out.println(str4.replace('R','M'));
        System.out.println(str4.trim().startsWith("R"));
        System.out.println(str4.trim().endsWith("Q"));

        String str2 = "Hello How ARE You";
        System.out.println(str2.toLowerCase());
        String str3 = "hello How are You";
        System.out.println(str3.toUpperCase());

        System.out.println("\n--------------------------------------");


        String name = "Aanand Kumar";
        System.out.println(name);
        int n = name.length();
        System.out.println(name.charAt(0));
        System.out.print(name.charAt(0));
        System.out.print(name.charAt(1));
        System.out.println(name.charAt(2));

        System.out.println(name.substring(3));
        System.out.println(name.substring(3,5));
        System.out.println(name.substring(0,3)+name.substring(n-3));

        System.out.println("\n--------------------------------------");

        StringBuilder sb = new StringBuilder("First, second");
        System.out.println(sb);
        sb.append(", third, fourth");
        System.out.println(sb);
        sb.append(", fifth");
        System.out.println(sb);
        System.out.println(sb.toString());

    }
}