package lec_9.classwork.point_1;

public class Belorus implements Nationality {
    private String nationality;

    public Belorus(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
