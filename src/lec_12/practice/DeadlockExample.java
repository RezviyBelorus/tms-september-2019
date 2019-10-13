package lec_12.practice;

public class DeadlockExample {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String[] args) {
        DeadlockExample example = new DeadlockExample();

        ThreadDemo1 T1 = new ThreadDemo1();
        ThreadDemo2 T2 = new ThreadDemo2();
        T1.start();
        T2.start();
    }
}

class ThreadDemo1 extends Thread {
    public void run() {
        synchronized (DeadlockExample.Lock1) {
            System.out.println("Thread 1: Holding lock 1...");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread 1: Waiting for lock 2...");

            synchronized (DeadlockExample.Lock2) {
                System.out.println("Thread 1: Holding lock 1 & 2...");
            }
        }
    }
}

class ThreadDemo2 extends Thread {
    public void run() {
        synchronized (DeadlockExample.Lock2) {
            System.out.println("Thread 2: Holding lock 2...");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread 2: Waiting for lock 1...");

            synchronized (DeadlockExample.Lock1) {
                System.out.println("Thread 2: Holding lock 1 & 2...");
            }
        }
    }
}