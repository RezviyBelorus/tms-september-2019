package lec_7.classwork.point_9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableExample {
    private static final String PATH = "src/lec_7/classwork/point_9/object";

    public static void main(String[] args) {
        try (ObjectOutputStream ow = new ObjectOutputStream(new FileOutputStream(PATH))) {
            Person andrei = new Person("Andrei", "Begunov", 22, new Friend(true));
            ow.writeObject(andrei);
            ow.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
