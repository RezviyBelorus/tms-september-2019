package lec_11.classwork.point_3;

public class MakaroshkaProducer implements Runnable{
    private String name;
    private Warehouse warehouse;
    private int kg;
    private String makaroshka;

    public MakaroshkaProducer(String name, Warehouse warehouse, int kg, String makaroshka) {
        this.name = name;
        this.warehouse = warehouse;
        this.kg = kg;
        this.makaroshka = makaroshka;
    }

    @Override
    public void run() {
        for (int i = 0; i < kg; i++) {
            warehouse.add(makaroshka);
        }
    }
}
