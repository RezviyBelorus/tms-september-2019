package lec_6.classwork.point_2;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        String stringNumber = "123a";

        int num = parseString(stringNumber);

        System.out.println("num = " + num);
        System.out.println("Program finished");
    }

    private static int parseString(String stringNumber) {
        try {
            int retrievedNumber = Integer.parseInt(stringNumber);

            return retrievedNumber;
        } catch (NumberFormatException e) {
            System.out.println(String.format("%s is not a number", stringNumber));

            return 333;
        } finally {
            return 666;
        }
    }
}
