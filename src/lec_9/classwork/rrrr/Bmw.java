package lec_9.classwork.rrrr;

import java.util.ArrayList;
import java.util.List;

public class Bmw<T extends Number> extends SuperCar {
    private String motor;
    private T type;

    public Bmw(String name, String motor) {
        super(name);
        this.motor = motor;
    }

    public T getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Bmw{" +
            "motor='" + motor + '\'' +
            '}';
    }

    public static void main(String[] args) {
        Bmw bmw = new Bmw("1.4", "BMW");

        List<Car> cars = new ArrayList<>();
        cars.add(bmw);

        System.out.println(cars);

        List<? extends Number> nums = new ArrayList<Integer>();
//        nums.add(1);
    }

    public static <E extends Number> Double sum(List<E> list) {
        Double sum = 0.0;

        for (Number number : list) {
            sum += number.doubleValue();
        }

        return sum;
    }

    public static Double sum(List<? super Integer> list, String message) {
        Double sum = 0.0;

        for (Object o : list) {

        }

        return sum;
    }
}
