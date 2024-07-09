package Multithreding.ak_10executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AK_02_TestingMultipleThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);

//        AK_00_PrintTask task1 = new AK_00_PrintTask('*');
//        AK_00_PrintTask task2 = new AK_00_PrintTask('$');
//        AK_00_PrintTask task3 = new AK_00_PrintTask('#');

//        service.submit(task1);
//        service.submit(task2);
//        service.submit(task3);

        for(int i=0; i<10; i++) {
            AK_00_PrintTask task = new AK_00_PrintTask((char) i);
            service.submit(task);
        }

        service.shutdown();
        System.out.println("\n******************** 1");

        // wait for all task to finish executing and timeout after 10 seconds
        if(!service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("\n******************** 2");
            service.shutdownNow();
        }

    }
}
