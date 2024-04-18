import java.io.FileReader;
import java.io.IOException;

public class AK_67_FileReader {
    public static void main(String[] args) {
        String fName = "AK_67_AbcRead.txt";

        try (FileReader reader = new FileReader(fName)) {
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char)read);
            } while (read != -1);
        }
        catch (IOException exception) {
            System.out.println("Error " + exception.getMessage());
        }

    }
}
