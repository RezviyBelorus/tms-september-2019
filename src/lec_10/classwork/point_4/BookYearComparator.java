package lec_10.classwork.point_4;

import java.util.Comparator;

public class BookYearComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o2.getYear() - o1.getYear();
    }
}
