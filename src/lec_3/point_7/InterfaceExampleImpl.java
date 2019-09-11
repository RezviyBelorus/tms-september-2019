package lec_3.point_7;

public class InterfaceExampleImpl implements InterfaceExample {
    private String name;
    private Integer age;

    public InterfaceExampleImpl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }
}
