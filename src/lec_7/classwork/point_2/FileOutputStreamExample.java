package lec_7.classwork.point_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    private static final String RELATIVE_PATH = "src/lec_7/classwork/text.txt";

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream(RELATIVE_PATH, true)) {
            String text = "Hello from FileOutputStream";

            fos.write(text.getBytes());

            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
