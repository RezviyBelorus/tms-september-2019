package lec_11.classwork.point_3;

public class MakaroshkaMain {
    public static void main(String[] args) throws InterruptedException {
        Warehouse warehouse = new Warehouse(3000);

        Runnable spagettiProducer = new MakaroshkaProducer("GalinaBlanca", warehouse, 1000, "Spagetti");
        Runnable raviolliProducer = new MakaroshkaProducer("PastaZara", warehouse, 2000, "Raviolli");
        Runnable spiralliProducer = new UniqueMakaroshkaProducer("Makfa", warehouse, 2000, "Spiralli");

        Thread spagetti = new Thread(spagettiProducer);
        Thread raviolli = new Thread(raviolliProducer);
        Thread spiralli = new Thread(spiralliProducer);

        spagetti.start();
        raviolli.start();
        spiralli.start();

        spagetti.join();
        raviolli.join();
        spiralli.join();

        System.out.println("kg makaroshek: " + warehouse.getMakaroshki().size());
    }
}
