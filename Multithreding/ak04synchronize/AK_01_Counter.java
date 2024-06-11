package Multithreding.ak04synchronize;

public class AK_01_Counter {
    private  int count = 0;
    public synchronized void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}
