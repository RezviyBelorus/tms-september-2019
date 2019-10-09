package lec_11.classwork.point_3;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<String> makaroshki;

    private Object syncObject = new Object();

    public Warehouse(int approximatelyKg) {
        makaroshki = new ArrayList<>(approximatelyKg);
    }

    public boolean add(String makaroshka) {
        synchronized (this) {
            return makaroshki.add(makaroshka);
        }
    }

    public synchronized boolean addSyncObject(String makaroshka) {
        return makaroshki.add(makaroshka);
    }

    public List<String> getMakaroshki() {
        synchronized (this) {
            return makaroshki;
        }
    }
}
