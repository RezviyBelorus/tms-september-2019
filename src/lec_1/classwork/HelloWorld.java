package lec_1.classwork;

public class HelloWorld {
    private static String classStringField;

    private static int classIntField;
    private static double classDoubleField;
    private static boolean classBooleanField;

    public static void main(String[] args) {
        int localVar = 0;
        System.out.println("Hello");

        System.out.println(localVar);
        System.out.println(classStringField);
        System.out.println(classIntField);
        System.out.println(classDoubleField);
        System.out.println(classBooleanField);

    }
}
