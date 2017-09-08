package com.charmingwong;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by CharmingWong on 2017/4/18.
 */
public class ReadWriteLockTest {

    public static void main(String[] args) {
        readWriteTest();
    }

    public static void readLockTest() {
        ReadWriteLock lock = new ReentrantReadWriteLock(true);
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    lock.readLock().lock();
                    try {
                        System.out.println(Thread.currentThread().getName() + " read");
                    } finally {
                        lock.readLock().unlock();
                    }
                }
            }).start();
        }
    }

    public static void writeLockTest() {
        ReadWriteLock lock = new ReentrantReadWriteLock(true);
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    lock.writeLock().lock();
                    try {
                        System.out.println(Thread.currentThread().getName() + " write");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.writeLock().unlock();
                    }
                }
            }).start();
        }
    }

    public static void readWriteTest() {
        ReadWriteLock lock = new ReentrantReadWriteLock(true);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.writeLock().lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " write");
                } finally {
                    lock.writeLock().unlock();
                }
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    lock.readLock().lock();
                    try {
                        Thread.sleep(200);
                        System.out.println(Thread.currentThread().getName() + " read");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.readLock().unlock();
                    }
                }
            }).start();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}