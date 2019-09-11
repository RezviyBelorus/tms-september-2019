package lec_3.point_2;

public abstract class AbstractClassExample {
    private String name;
    private Integer age;

    public AbstractClassExample(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void showName() {
        System.out.println("name = " + name);
    }

    public void showAge() {
        System.out.println("age = " + age);
    }

    public abstract void incrementAge();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
