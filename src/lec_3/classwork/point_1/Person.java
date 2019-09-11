package lec_3.classwork.point_1;

public class Person {
    // private - только внутри класса
    // package (default) - в пакете
    // protected - в пакете и у наследников
    // public - везде

    private String name;
    private Integer age;

    public Person() {
        this("Random name", 666);

        System.out.println("Person constructor");
    }

    public Person(String name, Integer age) {
        System.out.println("Person constructor with name and age");
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name);
    }

    public Integer incrementAge() {
        return ++age;
    }

}
