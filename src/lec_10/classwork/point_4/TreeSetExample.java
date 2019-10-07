package lec_10.classwork.point_4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(10);
        set.add(4);
        set.add(1);

        System.out.println(set);

        Book tratata = new Book(123, "Tratata");
        Book kolobok = new Book(444, "Kolobok");
        Book kolobok_a = new Book(444, "A");
        Book potter = new Book(22, "Potter");

        Comparator<Book> comparator = new BookYearComparator();
        comparator = comparator.reversed();
        comparator = comparator.thenComparing(new BookNameComparator());

        Set<Book> books = new TreeSet<>(comparator);
        books.add(tratata);
        books.add(kolobok);
        books.add(kolobok_a);
        books.add(potter);

        System.out.println(books);
    }
}
