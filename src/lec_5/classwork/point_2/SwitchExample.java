package lec_5.classwork.point_2;

public class SwitchExample {
    public static void main(String[] args) {
        int x = 6;

        switch (x) {
            case 2:
                x *= 5;
                break;
            case 4:
                x *= 4;
                break;
            case 6:
                x *= 10;
                break;
            default:
                x *= 33;
        }

        System.out.println(x);
    }
}
