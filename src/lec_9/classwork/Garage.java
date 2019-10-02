package lec_9.classwork;

import java.util.Arrays;

public class Garage <T> {
    T[] cars;

    public Garage(T[] cars) {
        this.cars = cars;
    }

    public T[] getCars() {
        return cars;
    }

    public void setCars(T[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + Arrays.toString(cars) +
                '}';
    }

    public static void main(String[] args) {
        BMW[] bmws = new BMW[5];
        Lada[] lada = new Lada[5];

        Garage<Car> bmwGarage = new Garage<>(bmws);
        bmwGarage.setCars(lada);
    }
}

interface Car {
    String getName();
}

class BMW implements Car {
    private String name;

    public BMW(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Lada implements Car {
    private String name;

    public Lada(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}