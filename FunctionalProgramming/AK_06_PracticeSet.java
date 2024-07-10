package FunctionalProgramming;
import java.util.List;

public class AK_06_PracticeSet {
    public static void main(String[] args) {
        // Filter and Concatenate
        List<String> strs = List.of("Happiness is", "abcd","found when you",
                "xyz", "stop comparing yourself", "to other people.");
        String result = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce("", (a, b) -> a + " " + b);
        System.out.println(result);
    }
}
