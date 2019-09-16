package lec_3.point_8;

import java.util.Objects;

public class Bmw {
    private String color;
    protected Boolean isAutomatic;

    public Bmw(String color, Boolean isAutomatic) {
        this.color = color;
        this.isAutomatic = isAutomatic;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bmw bmw = (Bmw) o;
        return Objects.equals(color, bmw.color) &&
                Objects.equals(isAutomatic, bmw.isAutomatic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, isAutomatic);
    }
}
