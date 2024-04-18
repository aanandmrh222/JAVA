import java.io.FileWriter;
import java.io.IOException;

public class AK_66_FileWriter {
    public static void main(String[] args) {

        // Define fileName
        String fileName = "AK_66_Abc.txt";

        // Create a FileWriter object
        try (FileWriter writer = new FileWriter(fileName)) {
            // Write a string to the file "AK_66First.txt"
            writer.write("This is Abc txt.\n");
            for(int i=0; i<5; i++) {
                writer.write("*");
            }
            writer.append("\nThis is append");

            // Optionally, you can flush the writer
            writer.flush();
            System.out.println("File Written Successfully");
        }
        catch (IOException e) {
            System.out.println("Exception occurred "+ e.getMessage());

        }


    }
}