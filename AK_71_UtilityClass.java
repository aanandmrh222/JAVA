import java.util.Collection;

public class AK_71_UtilityClass {
    public static <E> void print(Collection<E> collection) {
        System.out.println("Collection is: ");
        for(E coll : collection) {
            System.out.printf("%s    ", coll);
        }

    }
}
