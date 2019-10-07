package lec_10.classwork.point_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList = new ArrayList<>(200);

        System.out.println(arrayList.size());

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(22);

        System.out.println(arrayList.size());

        List<Integer> integers = Arrays.asList(1, 2, 3);

        arrayList.removeAll(integers);

        System.out.println(arrayList);

        arrayList.add(1);
        arrayList.add(2);

        arrayList.retainAll(integers);

        System.out.println(arrayList);

        arrayList.trimToSize();
    }
}
