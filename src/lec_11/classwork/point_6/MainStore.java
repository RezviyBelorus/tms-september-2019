package lec_11.classwork.point_6;

public class MainStore {
    public static void main(String[] args) throws InterruptedException {
        Store store = new Store();

        int number = 50;

        Producer producer = new Producer(store, number);
        Consumer consumer = new Consumer(store, number);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();

        System.out.println("Remained: " + store.getProduct());
    }
}
