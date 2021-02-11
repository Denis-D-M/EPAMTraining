package MultiThreading;


import Java8.Human;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(2000);
            return "Hi!";
        });

        System.out.println(future.get(1, TimeUnit.SECONDS));
        executorService.shutdown();


    }

}
