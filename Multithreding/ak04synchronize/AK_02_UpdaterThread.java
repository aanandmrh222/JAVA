package Multithreding.ak04synchronize;

public class AK_02_UpdaterThread extends Thread {
    private final AK_01_Counter counter;

    public AK_02_UpdaterThread(AK_01_Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++) {
            counter.increment();
        }
    }
}
