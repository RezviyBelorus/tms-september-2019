package lec_8.classwork;

public class PrivateClub {
    private String name;

    private PrivateClub() {
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
