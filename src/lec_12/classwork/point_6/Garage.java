package lec_12.classwork.point_6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Garage {
    private List<String> cars = new ArrayList<>();

    private ReentrantLock locker = new ReentrantLock();

    public void park(String number) {
        try {
            locker.lock();
            cars.add(number);
        } finally {
            locker.unlock();
        }
    }

    public List<String> getCars() {
        return cars;
    }
}
