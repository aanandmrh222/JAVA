package Multithreding.ak_12practiceSet;

public class AK_01_PrintNumbers implements Runnable {
    @Override
    public void run() {
        for(int i=1; i<=10; i++) {
            System.out.printf("Number is %d\n", i);
        }
    }
}
