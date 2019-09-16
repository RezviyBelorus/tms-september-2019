package lec_4.classwork.point_2_3;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");

        StringBuilder helloWorld = new StringBuilder("Hello World");
        StringBuilder helloWorld_2 = new StringBuilder("Hello World");

        System.out.println(helloWorld.equals(helloWorld_2));

    }
}
