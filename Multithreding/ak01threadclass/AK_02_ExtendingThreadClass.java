// In multi threads all threads are run parallelly


package Multithreding.ak01threadclass;

public class AK_02_ExtendingThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        AK_03_FirstTask t1 = new AK_03_FirstTask();
        AK_04_SecondTask t2 = new AK_04_SecondTask();
        AK_05_ThirdTask t3 = new AK_05_ThirdTask();

        System.out.println("\nStarting First Thread");
        t1.start();
        System.out.println("\nStarting Second Thread");
        t2.start();
        System.out.println("\nStarting Third Thread");
        t3.start();


        long endTime = System.currentTimeMillis();

        System.out.printf("%s Total time taken: ",Thread.currentThread().getName(), (endTime-startTime));

    }
}
