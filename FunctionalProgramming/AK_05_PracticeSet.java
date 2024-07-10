package FunctionalProgramming;
import java.util.List;

public class AK_05_PracticeSet {
    public static void main(String[] args) {
        List<String> names = List.of("Mohan", "Sohan", "Rohan");
        names.stream()
                .forEach(name -> System.out.println(name));
    }
}
