package lec_3.point_6;

public class InitBlockExampleMain {
    public static void main(String[] args) {
        InitBlocksExample ivan = new InitBlocksExample("Ivan", 44);
        System.out.println(ivan.getName());
        System.out.println(ivan.getAge());
        System.out.println(ivan.getSurname());


        ivan.setSurname("Kotov");

        System.out.println("===");

        InitBlocksExample egor = new InitBlocksExample("Egor", 33);
        System.out.println(egor.getName());
        System.out.println(egor.getAge());
        System.out.println(egor.getSurname());

    }
}
