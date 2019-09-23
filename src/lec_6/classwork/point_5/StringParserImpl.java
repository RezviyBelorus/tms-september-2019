package lec_6.classwork.point_5;

import lec_6.classwork.point_3_4.OopsSomethingGoesWrongException;

public class StringParserImpl implements StringParser {
    @Override
    public int parseString(String stringNumber) throws RuntimeException {
        try {
            int retrievedNumber = Integer.parseInt(stringNumber);

            return retrievedNumber;
        } catch (NumberFormatException e) {
            System.out.println(String.format("%s is not a number", stringNumber));

            throw new OopsSomethingGoesWrongException("Do you know some other numbers?!");
        } finally {
            return 666;
        }
    }
}
