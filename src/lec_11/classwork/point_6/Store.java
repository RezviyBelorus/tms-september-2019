package lec_11.classwork.point_6;

public class Store {
    private int product;

    public synchronized void put() throws InterruptedException {
        while (product >= 3) {
            wait();
        }
        product++;

        System.out.println("(put) Товар поставлен, общее кол-во: " + this.product);

        notify();
    }

    public synchronized void get() throws InterruptedException {
        while (product < 1) {
            wait();
        }
        product--;

        System.out.println("(get) Взят 1 товар, общее кол-во: " + this.product);

        notify();
    }

    public int getProduct() {
        return product;
    }
}
