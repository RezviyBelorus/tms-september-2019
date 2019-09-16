package lec_3.point_8;

public class BmwMain {
    public static void main(String[] args) {
        X5 x5 = new X5("gold", true, 210);
        System.out.println(x5);

        X5 x5_2 = new X5("gold", true, 210);
        System.out.println(x5_2);
        System.out.println("x5==x5_2: " + (x5.equals(x5_2)));
    }
}
