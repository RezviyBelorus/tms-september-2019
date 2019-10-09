package lec_11.classwork.point_7;

import java.util.concurrent.atomic.AtomicInteger;

public class StrungBufferThreadExample {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        int n = 1000_000;

        AtomicInteger atomicInteger = new AtomicInteger();

        Runnable runnable_1 = () -> {
            for (int i = 0; i < n; i++) {
                stringBuffer.append(" ");
                stringBuilder.append(" ");

                atomicInteger.getAndIncrement();
            }
        };

        Runnable runnable_2 = () -> {
            for (int i = 0; i < n; i++) {
                stringBuffer.append("A");
                stringBuilder.append("A");

                atomicInteger.getAndIncrement();
            }
        };

        Thread thread_1 = new Thread(runnable_1);
        Thread thread_2 = new Thread(runnable_2);

        thread_1.start();
        thread_2.start();

        thread_1.join();
        thread_2.join();

        System.out.println("stringBuffer length: " + stringBuffer.length());
        System.out.println("stringBuilder length: " + stringBuilder.length());
        System.out.println("atomicInteger: " + atomicInteger.incrementAndGet()); // ++x
    }
}
