/*
 1. Purpose of join: The join method is used to make the calling thread
     wait until the thread on which join has been called completes its execution.
 2. Synchronization of Threads: join helps in synchronizing multiple
     threads, ensuring that a thread completes its execution before
     the next steps in the calling thread proceed.
 3. Overloaded Versions: join comes in three versions:
    • join(): Waits indefinitely until the thread on which it's called finishes.
    • join(long millis): Waits for the thread to die for the specified milliseconds.
    • join(long millis, int nanos): Waits for the thread to die for the specified
       milliseconds plus nanoseconds.
 */

package Multithreding.ak03join;
import Multithreding.ak02runnable.AK_01_PrintTask;

public class AK_01_TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        AK_01_PrintTask p1 = new AK_01_PrintTask('*');
        AK_01_PrintTask p2 = new AK_01_PrintTask('$');
        AK_01_PrintTask p3 = new AK_01_PrintTask('#');

        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\nThread 1 started");
        Thread t2 = new Thread(p2);
        t2.start();
        System.out.println("\nThread 2 started");
        t1.join();
        Thread t3 = new Thread(p3);
        t3.start();
        System.out.println("\nThread 3 started");

        long endTime = System.currentTimeMillis();

        System.out.printf("%s Total time taken: ",Thread.currentThread().getName(), (endTime-startTime));

    }
}
