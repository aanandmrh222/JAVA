import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AK_75_UniqueCharacters {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = input.next();

        for( char ch : str.toCharArray()) {
            unique.add(ch);
        }

        System.out.println("Your string has unique characters: "+ unique.size());
    }
}
