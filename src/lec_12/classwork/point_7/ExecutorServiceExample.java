package lec_12.classwork.point_7;

import lec_12.classwork.point_2.CallableExample;

import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        CallableExample callableExample = new CallableExample();

        Future<String> submit = executorService.submit(callableExample);

        String result = submit.get();

        System.out.println(result);

        executorService.awaitTermination(3, TimeUnit.SECONDS);
        executorService.shutdownNow();


        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<String> schedule = scheduledExecutorService.schedule(callableExample, 3, TimeUnit.SECONDS);
        String scheduledResult = schedule.get();
        System.out.println(scheduledResult);

        scheduledExecutorService.shutdown();
    }
}
