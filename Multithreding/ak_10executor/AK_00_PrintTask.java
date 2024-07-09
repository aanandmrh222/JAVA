package Multithreding.ak_10executor;

public class AK_00_PrintTask implements Runnable {
    @Override
    public void run() {
        // Print task
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d%c ", i, targetChar);
        }
        System.out.printf("\n %s %c task complete",
                Thread.currentThread().getName(),
                targetChar);
    }

    private final char targetChar;

    public AK_00_PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
