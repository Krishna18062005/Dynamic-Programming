// Exercise 26: Thread Creation
// This program creates and starts two threads that print messages concurrently.

public class ThreadCreationExample extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
        }
    }
    
    public static void main(String[] args) {
        ThreadCreationExample thread1 = new ThreadCreationExample();
        ThreadCreationExample thread2 = new ThreadCreationExample();
        thread1.start();
        thread2.start();
    }
}