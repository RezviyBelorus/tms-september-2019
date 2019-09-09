package lec_2.classwork.point_3;

public class Point_3 {
    public static void main(String[] args) {
        int myInt = 270;

        byte myByte = (byte) myInt;

        // 128 - 256 -> -128
        // 270 -256 -> 14
        System.out.println(myByte);

        myByte = 127;
        myInt = myByte;
        System.out.println(myInt);

        double myDouble = 13.7;
        int fromDouble = (int) myDouble;
        System.out.println(fromDouble);

        myDouble = fromDouble;
        System.out.println(myDouble);

//        String stringNumber = (String) fromDouble; <- not compile
        String stringNumber = String.valueOf(fromDouble);
        System.out.println("stringNumber=" + stringNumber);
    }
}
