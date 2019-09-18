package lec_5.classwork.point_5;

import java.util.Arrays;

public class ForExample {
    public static void main(String[] args) {
        int[] ints = initArray(10, 4);

        System.out.println(Arrays.toString(ints));
    }

    private static int[] initArray(int size, int multiplier) {
        int[] ints = new int[size];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i * multiplier;
        }
        return ints;
    }
}
