package lec_5.classwork.point_1;

public class IfExample {
    public static void main(String[] args) {
        int x = 3;

        if (x < 2 || x != 99) {
            x *= 10;
        }

        if (x < 10) {
            x *= 4;
        } else {
            x *= 20;
        }

        System.out.println(x);
    }
}
