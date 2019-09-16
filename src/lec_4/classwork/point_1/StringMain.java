package lec_4.classwork.point_1;

public class StringMain {
    public static void main(String[] args) {
        String text_1 = "Some text";
        String text_2 = "Some text";
        String text_3 = new String("Some text");
        text_3 = text_3.intern();

        String text_4 = new String("Some text");

        text_1 = text_1.concat("Hello") + " World";

        System.out.println("text_1 == text_2: " + (text_1 == text_2));
        System.out.println("text_1 == text_4: " + (text_1.equals(text_4)));

    }
}
