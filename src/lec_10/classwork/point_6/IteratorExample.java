package lec_10.classwork.point_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while ((iterator.hasNext())) {
            Integer next = iterator.next();
            System.out.println("next: " + next);
            if (next % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
