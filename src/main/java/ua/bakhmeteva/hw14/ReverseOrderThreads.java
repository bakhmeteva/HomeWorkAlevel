package ua.bakhmeteva.hw14;

public class ReverseOrderThreads {

    public static void main(String[] args) {
        for (int i = 49; i >= 0; i--) {
            final int threadNumber = i;
            Thread thread = new Thread(() -> printMessage(threadNumber));
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static synchronized void printMessage(int threadNumber) {
        System.out.println("Hello from thread " + threadNumber);
    }
}
