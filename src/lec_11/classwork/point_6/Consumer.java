package lec_11.classwork.point_6;

public class Consumer implements Runnable {
    private Store store;
    private int toConsume;

    public Consumer(Store store, int toConsume) {
        this.store = store;
        this.toConsume = toConsume;
    }

    @Override
    public void run() {
        for (int i = 0; i < toConsume; i++) {
            try {
                store.get();
//                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
