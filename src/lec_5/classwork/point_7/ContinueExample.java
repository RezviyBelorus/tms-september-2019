package lec_5.classwork.point_7;

public class ContinueExample {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5};

        for (int i = 0; i < ints.length; i++) {
            int elem = ints[i];
            if (elem != 3) {
                System.out.println(elem);
            }
        }
    }
}
