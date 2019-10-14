package lec_12.classwork.point_6;

public class ReentrantLockExample {
    public static void main(String[] args) throws InterruptedException {
        Garage garage = new Garage();

        Runnable runnable = () -> {
            for (int i = 0; i < 200_000; i++) {
                garage.park(String.valueOf(i));
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread_2 = new Thread(runnable);

        thread.start();
        thread_2.start();

        thread.join();
        thread_2.join();

        System.out.println(garage.getCars().size());
    }
}
