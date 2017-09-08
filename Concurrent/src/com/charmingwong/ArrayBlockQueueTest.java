package com.charmingwong;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by CharmingWong on 2017/4/18.
 */
public class ArrayBlockQueueTest {

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<>(5);
        Runnable runnable = () -> {
            int count = 0;
            while (true) {
                try {
                    count++;
                    abq.put(Thread.currentThread().getName() + " " +  count);
                    Thread.sleep(2000);
                } catch (Exception e) {

                }
            }
        };
        for (int i = 0; i < 3; i++) {
            new Thread(runnable).start();
        }
        while (true) {
            System.out.println(abq.take());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
