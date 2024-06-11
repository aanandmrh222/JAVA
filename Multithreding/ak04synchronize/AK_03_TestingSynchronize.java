/*
1. Mutual Exclusion: The synchronize keyword in Java ensures that
    only one thread can execute a block of code at a time, providing
    mutual exclusion and preventing race conditions.
2. Object Lock: When a thread enters a synchronized block or method,
    it acquires a lock on the object or class, depending on whether
    the method is an instance method or a static method.
3. Visibility: It ensures that changes made by one thread to shared
    data are visible to other threads
 */

package Multithreding.ak04synchronize;

public class AK_03_TestingSynchronize {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        AK_01_Counter counter = new AK_01_Counter();
        AK_02_UpdaterThread t1 = new AK_02_UpdaterThread(counter);
        AK_02_UpdaterThread t2 = new AK_02_UpdaterThread(counter);

        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Thread Interrupted: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();

        System.out.printf("Final counter value: %d, and time taken: %d", counter.getCount(), (endTime-startTime));
    }
}
