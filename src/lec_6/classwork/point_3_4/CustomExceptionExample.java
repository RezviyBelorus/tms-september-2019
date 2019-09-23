package lec_6.classwork.point_3_4;

public class CustomExceptionExample {
    public static void main(String[] args) throws OopsSomethingGoesWrongException {
        parseString("123A");
    }

    private static int parseString(String stringNumber) throws OopsSomethingGoesWrongException {
        try {
            int retrievedNumber = Integer.parseInt(stringNumber);

            return retrievedNumber;
        } catch (NumberFormatException e) {
            System.out.println(String.format("%s is not a number", stringNumber));

            throw new OopsSomethingGoesWrongException("Do you know some other numbers?!");
        }
    }
}
