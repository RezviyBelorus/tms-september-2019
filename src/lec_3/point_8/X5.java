package lec_3.point_8;

import java.util.Objects;

public class X5 extends Bmw implements Car, Wheels {
    private int hp;

    public X5(String color, Boolean isAutomatic, int hp) {
        super(color, isAutomatic);
        this.hp = hp;
    }

    @Override
    public int getWheels() {
        return 44;
    }

    public String toString() {
        return "Color = " + getColor() + ", \n" + "isAutomatic = " + isAutomatic + ", \n" + "HP = " + hp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        X5 x5 = (X5) o;
        return hp == x5.hp &&
                getColor().equals(x5.getColor()) &&
                isAutomatic.equals(x5.isAutomatic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, getColor(), isAutomatic);
    }
}
