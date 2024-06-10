package Multithreding.ak01threadclass;

public class AK_05_ThirdTask extends Thread{
    @Override
    public void run() {
        // Third task
        for(int i=1; i<=100; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.printf("\n %s # task completed", Thread.currentThread().getName());
    }
}
