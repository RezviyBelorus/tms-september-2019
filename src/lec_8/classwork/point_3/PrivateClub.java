package lec_8.classwork.point_3;

public class PrivateClub {
    private final String name;

    public PrivateClub() {
        this("Ahmed");
    }

    private PrivateClub(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PrivateClub{" +
            "name='" + name + '\'' +
            '}';
    }
}
