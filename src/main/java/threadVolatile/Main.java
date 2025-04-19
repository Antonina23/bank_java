package threadVolatile;

public class Main {
    private static volatile boolean stop = false;

    public static void main(String[] args) {
        Thread countThread = new Thread(() -> {
            int count = 0;
            while (stop = false) {
                count++;
                System.out.println("Counter: " + count);
            }
        });

        countThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stop = true;
        System.out.println("Thread has been stopped");
    }
}
