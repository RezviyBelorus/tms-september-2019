package lec_8.classwork;

import java.lang.reflect.Field;

public class Book {
    private final String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Book harry = new Book("harry");

        Class<? extends Book> aClass = harry.getClass();

        Field name = aClass.getDeclaredField("name");

        name.setAccessible(true);

        name.set(harry, "new book");

        System.out.println(harry);
    }
}
