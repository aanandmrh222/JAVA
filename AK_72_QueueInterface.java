/*
1. It's a collection designed for holding elements prior to processing.
2. Ordering: Typically, it orders elements in a FIFO (First-In-First-Out) manner.
3. End Points: Offers two ends - one for insertion (tail) and the other for removal (head)
 */

import java.util.LinkedList;
import java.util.Queue;

public class AK_72_QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements
        queue.add(1);
        queue.offer(2);


        for(int i : queue) {
            System.out.print(i + "    ");
        }
        System.out.println();

        AK_71_UtilityClass.print(queue);

        System.out.println();
        System.out.println("Show head element "+queue.peek());
        System.out.println("Show head element "+queue.element());


        System.out.println("Remove head element "+queue.remove());

        AK_71_UtilityClass.print(queue);
        System.out.println();
        System.out.println("Remove head element "+queue.poll());
        AK_71_UtilityClass.print(queue);

        System.out.println();
        System.out.println("Remove head element "+ queue.poll());
        System.out.println("Remove head element "+ queue.remove());



    }
}
