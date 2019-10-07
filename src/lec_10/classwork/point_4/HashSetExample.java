package lec_10.classwork.point_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("A");
        set.add("B");
        set.add("C");

        System.out.println(set);

        Book potter = new Book(1955, "Potter");
        Book potter_2 = new Book(2019, "Potter");
        Book kolobok = new Book(1923, "Kolobok");

        Set<Book> books = new HashSet<>();
        books.add(potter);
        books.add(potter_2);
        books.add(kolobok);

        System.out.println(books);


        Map<String, Book> bookMap = new HashMap<>();
        bookMap.put("A", potter);
        bookMap.put("B", kolobok);
        bookMap.put("A", potter_2);

        System.out.println(bookMap);
    }
}
