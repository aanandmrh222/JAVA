package Multithreding.ak_12practiceSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AK_02_SingleThreadService {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            AK_01_PrintNumbers task = new AK_01_PrintNumbers();
            service.submit(task);
        }
    }
}
