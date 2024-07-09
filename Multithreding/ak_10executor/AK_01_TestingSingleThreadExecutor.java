package Multithreding.ak_10executor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AK_01_TestingSingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        AK_00_PrintTask task1 = new AK_00_PrintTask('*');
        AK_00_PrintTask task2 = new AK_00_PrintTask('$');
        AK_00_PrintTask task3 = new AK_00_PrintTask('#');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        service.shutdown();
    }
}
