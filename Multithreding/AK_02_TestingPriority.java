/*
1. Priority Levels: Java threads have priority levels from 1 (lowest)
    to 10 (highest), with a default value of 5.
 2. Influence on Execution: A thread's priority suggests the importance of a thread
     to the scheduler, though it "DOESN'T GUARANTEE" the order of execution.
 3. Set and Get Priority: Use setPriority(int) to change a thread's
     priority and getPriority() to retrieve it.
 */

package Multithreding;
import Multithreding.ak02runnable.AK_01_PrintTask;

public class AK_02_TestingPriority {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        AK_01_PrintTask p1 = new AK_01_PrintTask('*');
        AK_01_PrintTask p2 = new AK_01_PrintTask('$');
        AK_01_PrintTask p3 = new AK_01_PrintTask('#');

        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();

        long endTime = System.currentTimeMillis();

        System.out.printf("%s Total time taken: ",Thread.currentThread().getName(), (endTime-startTime));

    }
}
