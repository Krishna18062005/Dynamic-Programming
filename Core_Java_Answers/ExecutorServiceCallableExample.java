// Exercise 41: Executor Service and Callable
// This program uses ExecutorService to run Callable tasks that return results.

import java.util.concurrent.*;
import java.util.*;

public class ExecutorServiceCallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int taskId = i;
            tasks.add(() -> "Result from task " + taskId);
        }
        List<Future<String>> results = executor.invokeAll(tasks);
        for (Future<String> future : results) {
            System.out.println(future.get());
        }
        executor.shutdown();
    }
}