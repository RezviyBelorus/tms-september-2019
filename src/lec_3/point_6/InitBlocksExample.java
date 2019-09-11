package lec_3.point_6;

public class InitBlocksExample {
    private static final String PERSON_NATIONALITY = "Belorus";

    private String name;
    private char sex;
    private Integer age;


    private static String surname;

    static {
        System.out.println("Static init block");
        surname = "Zidane";
    }

    {
        System.out.println("Init block");
        this.name = "Init name";
        this.age = 33;
    }

    public InitBlocksExample(String name, Integer age) {
        this(name, 'M', age);

        System.out.println("Constructor");
    }

    public InitBlocksExample(String name, char sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String newSurname) {
        surname = newSurname;
    }

}
