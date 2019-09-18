package lec_5.classwork.point_8;

import java.util.Arrays;

public class Array2d {
    public static void main(String[] args) {
        int[][] ints = new int[3][];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = new int[i * 2];
        }

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = i * j;
            }
        }

        for (int[] anInt : ints) {
            System.out.println(Arrays.toString(anInt));
        }
    }
}
