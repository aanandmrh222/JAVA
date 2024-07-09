package Multithreding.ak_14practiceSet;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class AK_02_TestingFactorial {
    public static void main(String[] args) {
        try(ExecutorService service = Executors.newFixedThreadPool(3)) {
            List<Future<Integer>> list = new ArrayList<>();

            for(int i=0; i<10; i++) {
                AK_01_FactorialCalculator task = new AK_01_FactorialCalculator(i);
                list.add(service.submit(task));
            }

            for(Future<Integer> future : list) {
                System.out.printf("\nResult is %d", future.get());
            }

            service.shutdown();

            if(!service.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("Band kar do");
                service.shutdownNow();
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
