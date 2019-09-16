package lec_4.classwork.point_4;

public class CurrentTimeMillisExample {
    public static void main(String[] args) throws InterruptedException {
        String s = "";

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            s = s + i;
        }
        long finish = System.currentTimeMillis();

        System.out.println(finish - start);

        System.out.println(s);
    }
}
