package lec_3.point_7;

public class InterfaceExampleMain {
    public static void main(String[] args) {
        InterfaceExampleImpl ivan = new InterfaceExampleImpl("Ivan", 44);

        System.out.println(ivan.getName());
        System.out.println(ivan.getAge());
    }
}
