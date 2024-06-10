package Multithreding.ak02runnable;

public class AK_02_TestingRunnables {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        AK_01_PrintTask p1 = new AK_01_PrintTask('*');
        AK_01_PrintTask p2 = new AK_01_PrintTask('$');
        AK_01_PrintTask p3 = new AK_01_PrintTask('#');

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();

        long endTime = System.currentTimeMillis();

        System.out.printf("%s Total time taken: ",Thread.currentThread().getName(), (endTime-startTime));

    }
}
