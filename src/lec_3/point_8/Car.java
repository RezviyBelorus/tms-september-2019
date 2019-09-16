package lec_3.point_8;

public interface Car {

    default int getWheels(int multiplier) {
        return multiplier * 2;
    }
}
