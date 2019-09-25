package lec_7.classwork.point_9;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -2718393844448403867L;
    private String name;
    private String surname;
    private int age;
    private Friend friend;

    public Person(String name, String surname, int age, Friend friend) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                '}';
    }
}
