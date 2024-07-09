package Multithreding.ak_11future;
import java.util.concurrent.Callable;

public class AK_02_FetchName implements Callable<String> {

    private final String name;

    public AK_02_FetchName(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.printf("\nGetting full name of %s from server", name);
        Thread.sleep(4000);
        return name + " Kumar";
    }
}
