import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AK_68_PracticeSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a file name: ");
        String fileName = input.next();

        try (FileReader reader = new FileReader(fileName)) {
            int read;
            while ((read=reader.read()) != -1) {
                System.out.print((char) read);
            }
        }
        catch (FileNotFoundException e) {
            System.out.printf("%s not found",fileName);
        }
        catch (IOException e) {
            System.out.println("Exception error "+ e.getMessage());
        }


    }
}
