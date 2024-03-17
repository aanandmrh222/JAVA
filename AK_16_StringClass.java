public class AK_16_StringClass {
    public static void main(String[] args) {
        String str = "Aanand";
        System.out.println("Your name is: "+ str);

        char[] str1 = {'A', 'a', 'n', 'a', 'n', 'd'};
        String str2 = new String(str1);
        System.out.println("Name:- " + str2);

        System.out.println(" -- Escape Characters -- ");
        System.out.println("He said, \"I believe that the Earth is Flat\".");
        System.out.println("she said, \'But the Earth is spherical\'.");
        System.out.println("The path is D:\\Docs\\Java\\Strings");
        System.out.println("My name is Anthony. \nI'm an Artist.");
        System.out.println();
        System.out.println("Age:\t18");
        System.out.println("Addresss\b: Washington DC");    // backspacing(\b)

        System.out.println(" -- String Methods -- ");
        String quote = "To be or not to be";
        System.out.println(quote.length());
        System.out.println(quote.indexOf("be"));    //index of text
        System.out.println(quote.indexOf("r"));     //index of character
        String quote1 = "THOR: Love and Thunder";
        System.out.println(quote1.toLowerCase());
        String quote2 = "THOR: Love and Thunder";
        System.out.println(quote2.toUpperCase());

        System.out.println("--------------------------------------");
        String name = "Sandeep";
        int marks = 45;
        System.out.println("Hello, "+name+ " Your marks are: " + marks);

        System.out.printf("Hello, %s your marks are: %d", name, marks);
        System.out.printf("\nHello, %15s your marks are: %d", name, marks);
        System.out.printf("\nHello, %15S your marks are: %d", name, marks);
        System.out.printf("\nHello, %-15S your marks are: %d", name, marks);
        System.out.printf("\nHello, %S your marks are: %0,5d", name, marks);

        System.out.println("\n--------------------------------------");
        StringBuilder sb = new StringBuilder("First ");
        sb.append(45);
        sb.append(", now added again");
        System.out.println(sb);
        System.out.println(sb.toString());

        System.out.println("\n--------------------------------------");

    }
}
