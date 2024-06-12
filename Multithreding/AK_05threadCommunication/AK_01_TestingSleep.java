/*
1. sleep(long millis): Causes the currently executing thread to sleep
    (temporarily cease execution) for the specified number of milliseconds.
2. yield(): Causes the currently executing thread to pause and allow other
    threads to execute. It's a way of suggesting that other threads of the
    same priority can run.
3. wait(): Causes the current thread to wait until another thread invokes the notify()
    or notifyAll() method for this object. It releases the lock held by this thread.
4. notify(): Wakes up a single thread that is waiting on the object's monitor.
    If any threads are waiting, one is chosen to be awakened.
5. notifyAll(): Wakes up all threads that are waiting on the object's monitor.
 */

package Multithreding.AK_05threadCommunication;

public class AK_01_TestingSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before Sleeping");
        Thread.sleep(10000);
        System.out.println("Woke Up");
    }
}
