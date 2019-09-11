package lec_3.point_7;

public interface InterfaceExample {
    String SEX = "M"; // public static final

    String getName();

    default Integer getAge(){
        return 33;
    };
}
