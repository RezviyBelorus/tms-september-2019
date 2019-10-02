package lec_9.classwork.point_1;

public class Russian implements Nationality {
    private String nationality;

    public Russian(String nationality) {
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
