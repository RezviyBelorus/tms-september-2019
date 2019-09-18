package lec_5.classwork.point_7;

import java.util.Arrays;

public class BreakExample {
    public static void main(String[] args) {
        int[] ints = new int[10];
        int elemToFind = 2;

        for (int i = 0; i < 10; i++) {
            ints[i] = (int) (Math.random() * 100);
        }

        Integer firstEvenElem = null;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                firstEvenElem = ints[i];
                break;
            }

        }

        System.out.println(Arrays.toString(ints));

        System.out.println("first even elem = " + firstEvenElem);
    }
}
