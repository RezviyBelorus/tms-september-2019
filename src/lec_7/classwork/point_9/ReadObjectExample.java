package lec_7.classwork.point_9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectExample {
    private static final String PATH = "src/lec_7/classwork/point_9/object";

    public static void main(String[] args) {
        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(PATH))) {

            Person person = (Person) os.readObject();
            System.out.println(person);

//            Friend friend = (Friend) os.readObject();
//            System.out.println(friend);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
