package lec_2.classwork.point_4;

import java.math.BigDecimal;

public class Point_4 {
    public static void main(String[] args) {
        byte myByte_1 = 5;
        byte myByte_2 = 10;

        int sumByte = myByte_1 + myByte_2;

        char myChar = 33;
        short myShort = 1000;

        int charAndShortSum = myChar + myShort;

        double myDouble_1 = 1.4;
        double myDouble_2 = 1.7;

        double sumDouble = myDouble_1 + myDouble_2;
        System.out.println("Sum double = " + sumDouble);

        BigDecimal bigDecimal_1 = BigDecimal.valueOf(myDouble_1);
        BigDecimal bigDecimal_2 = BigDecimal.valueOf(myDouble_2);

        BigDecimal sumBigDecimal = bigDecimal_1.add(bigDecimal_2);
        System.out.println("Sum BigDecimal = " + sumBigDecimal.doubleValue());


        int myInt_1 = 3;
        int myInt_2 = 2;
        System.out.println("myInt_1 / myInt_2 = " + myInt_1 / myInt_2);

        myDouble_1 = 3.0;
        myDouble_2 = 2.0;
        System.out.println("myDouble_1 / myDouble_2 = " + myDouble_1 / myDouble_2);

        System.out.println("5 % 7 = " + 5 % 7);
        System.out.println("7 % 5 = " + 7 % 5);

        System.out.println("2.0 / 4.0 = " + 2.0 / 4.0);
        System.out.println("2 % 4 = " + 2 % 4);

        boolean myBooleanTrue = true;
        boolean myBooleanFalse = false;
        System.out.println("!myBoolean = " + !myBooleanTrue);
        System.out.println("myBooleanTrue == myBooleanFalse = " + (myBooleanTrue == myBooleanFalse));

        System.out.println("8 << 3 = " + (8 << 3));
        System.out.println("8 >> 2 = " + (8 >> 2));
        System.out.println("8 >> 4 = " + (8 >> 4));

        int myInt = 10;
//        myInt = myInt + 5;
        myInt += 5;
        System.out.println("myInt = " + myInt);

        myInt += 1;
        myInt++; // -> myInt = myInt + 1;
        myInt--; // -> myInt = myInt - 1;

        myInt = 0;
        System.out.println("myInt++ = " + myInt++);
        System.out.println("myInt=" + myInt);
        System.out.println("++myInt = " + ++myInt);

        myInt = 0;
        increment(myInt++);
    }

    private static void increment(int x) {
        System.out.println("increment = " + x++);
    }
}
