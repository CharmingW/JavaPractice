package com.charmingwong;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by CharmingWong on 2017/4/18.
 */
public class ExecutorCompletionServiceTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CompletionService<String> completionService = new ExecutorCompletionService<>(executorService);
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Thread.currentThread().getName();
            }
        };
        for (int i = 0; i < 100; i++) {
            completionService.submit(callable);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(completionService.take().get());
        }
    }
}
