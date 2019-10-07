package lec_10.classwork.point_3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, LinkedList<String>> map = new HashMap<>();

        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");

        map.put("Group 1", ll);
        map.put("Group 2", ll);

        LinkedList<String> strings = map.get("1");


        Student alex = new Student(22, "Alex");
        Student egor = new Student(23, "Egor");

        Map<Student, Integer> students = new HashMap<>();
        students.put(alex, 77);
        students.put(egor, 77);

        System.out.println(students.get(alex));

        alex.setAge(23);

        Student alex1 = new Student(22, "Alex");

        System.out.println(students.get(alex1));
    }
}
