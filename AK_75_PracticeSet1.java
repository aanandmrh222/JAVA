import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AK_75_PracticeSet1 {
    public static void swap(List<Integer> list, int x, int y) {
        int temp = list.get(x);
        list.set(x,list.get(y));
        list.set(y,temp);
    }

    public static void reverseList(List<Integer> list) {
//        Collections.reverse(list);
        for(int i=0; i<list.size()/2; i++) {
            swap(list, i, list.size()- 1 - i);
        }
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println("Before swapping \n"+list);
        swap(list, 1, 7);
        System.out.println("After swapping \n"+list);

        System.out.println("-------------------------");

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,76,95);
        System.out.println("Original List \n"+list1);
        reverseList(list1);
        System.out.println("Reverse List \n"+list1);
    }
}
