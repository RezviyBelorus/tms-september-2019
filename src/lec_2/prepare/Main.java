package lec_2.prepare;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        double d = 1.4;
        double c = 1.7;
        System.out.println(d+c);

        Integer integer = 0;

        incrementByOne(++integer);

        System.out.println(8<<3);
        System.out.println(8>>50);

        String x = "123";
//        Integer s = (Integer) x;

        System.out.println(2<<2);
        System.out.println(16>>2);

        char myChar = 33;
        char sym = '\uffff';
        char symB = 'K';
        System.out.println(myChar);
        System.out.println(sym);
        System.out.println(symB);
    }


    public static void incrementByOne(int x) {
        System.out.println(x++);
    }
}
