package Multithreding.ak_14practiceSet;

import java.util.concurrent.Callable;

public class AK_01_FactorialCalculator implements Callable<Integer> {

    private final int number;

    public AK_01_FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        if(number <= 1) {
            return 1;
        }
        int result = 1;
        for(int i=2; i<number; i++) {
            result *= i;
        }
        return result;
    }
}
