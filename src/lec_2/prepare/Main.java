package lec_2.prepare;

public class Main {
    public static void main(String[] args) {
        double d = 1.4;
        double c = 1.7;
        System.out.println(d + c);

        Integer integer = 0;

        incrementByOne(++integer);

        System.out.println(8 << 3);
        System.out.println(8 >> 50);

        String x = "123";
//        Integer s = (Integer) x;

        System.out.println(2 << 2);
        System.out.println(16 >> 2);

        char myChar = 33;
        char sym = '\uffff';
        char symB = 'K';
        System.out.println(myChar);
        System.out.println(sym);
        System.out.println(symB);


        /*
    char c2 = Oxf132;
    char c3 = ' a';
    char c4 = '\n';
         */

        int big = 257;
        byte b = (byte) big; //280-256
        System.out.println(b);

        System.out.println(257 % 256);
    }


    public static void incrementByOne(int x) {
        System.out.println(x++);
    }
}
