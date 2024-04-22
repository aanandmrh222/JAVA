import java.util.*;

public class AK_75_Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,7,1,4,6,9,1,7,6);
        System.out.println("Frequency of 1 is: "+ Collections.frequency(list,1));
        System.out.println("Frequency of 6 is: "+ Collections.frequency(list,6));
        System.out.println("Frequency of 4 is: "+ Collections.frequency(list,4));
    }
}
