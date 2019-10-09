package lec_11.classwork.point_6;

public class Producer implements Runnable {
    private Store store;
    private int toProduce;

    public Producer(Store store, int toProduce) {
        this.store = store;
        this.toProduce = toProduce;
    }

    @Override

    public void run() {
        for (int i = 0; i < toProduce; i++) {
            try {
                store.put();
//                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
