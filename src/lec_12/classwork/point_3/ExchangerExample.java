package lec_12.classwork.point_3;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        Messenger fu = new Messenger(exchanger, "Thread-1", "FU");
        Messenger hello = new Messenger(exchanger, "Thread-2", "Hello, nigga");
        Messenger sasha = new Messenger(exchanger, "Thread-3", "Sasha");
        Messenger back = new Messenger(exchanger, "Thread-4", "Come back");

        new Thread(fu).start();
        new Thread(hello).start();
        new Thread(sasha).start();
        new Thread(back).start();
    }
}

class Messenger implements Runnable {
    private Exchanger<String> exchanger;
    private String name;
    private String message;

    public Messenger(Exchanger<String> exchanger, String name, String message) {
        this.exchanger = exchanger;
        this.name = name;
        this.message = message;
    }

    @Override
    public void run() {
        try {
            String exchange = exchanger.exchange(message);
            System.out.println(name + ": " + exchange);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
