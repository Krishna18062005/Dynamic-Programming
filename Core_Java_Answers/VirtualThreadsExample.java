// Exercise 40: Virtual Threads (Java 21)
// This program launches 100,000 virtual threads that do minimal work.

public class VirtualThreadsExample {
    public static void main(String[] args) {
        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(() -> {
                // Uncomment to print if needed (may affect performance):
                // System.out.println("Virtual thread running.");
            });
        }
        System.out.println("Launched 100,000 virtual threads.");
    }
}