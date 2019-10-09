package lec_11.classwork.point_1;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new MyThread("my thread");

        Runnable runnable = new MyRunnable("my runnable");
        Thread threadRunnable = new Thread(runnable);

        String name = "my lambda";

        Runnable lambda = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(name + ": " + i);

                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        threadRunnable.start();
        thread.start();

        thread.join();
        threadRunnable.join();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main finished");
    }
}
