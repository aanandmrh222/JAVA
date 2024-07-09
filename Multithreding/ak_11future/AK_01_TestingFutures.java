package Multithreding.ak_11future;
import java.util.concurrent.*;

public class AK_01_TestingFutures {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        ExecutorService service = Executors.newFixedThreadPool(2);
//        ExecutorService service = Executors.newFixedThreadPool(1);
        ExecutorService service = Executors.newFixedThreadPool(4);

        AK_02_FetchName task1 = new AK_02_FetchName("Aanand");
        AK_02_FetchName task2 = new AK_02_FetchName("Aayush");
        AK_02_FetchName task3 = new AK_02_FetchName("Raushan");
        AK_02_FetchName task4 = new AK_02_FetchName("Suman");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);
        Future<String> name4 = service.submit(task4);

        System.out.printf("\nFull name is %s", name1.get());
        System.out.printf("\nFull name is %s", name2.get());
        System.out.printf("\nFull name is %s", name3.get());
        System.out.printf("\nFull name is %s", name4.get());

        service.shutdown();
    }
}
