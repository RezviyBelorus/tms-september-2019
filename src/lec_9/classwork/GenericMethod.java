package lec_9.classwork;

import java.util.Arrays;

public class GenericMethod {
    public static void main(String[] args) {

        Printer printer = new Printer();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        printer.print(people);
        printer.print(numbers);

        Number[] numbers1 = new Number[10];
        numbers1[0] = 33;
        numbers1[1] = 33.5;

        System.out.println(Arrays.toString(numbers1));
    }
}

class Printer {

    public <T> void print(T[] items) {
        for (T item : items) {
            System.out.println(item);
        }
    }
}