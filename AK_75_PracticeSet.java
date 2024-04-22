public class AK_75_PracticeSet {
    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(concatenate("Aanand", "Kumar"));
        System.out.println(concatenate("Hello,", "How", "are", "you?"));
    }
}
