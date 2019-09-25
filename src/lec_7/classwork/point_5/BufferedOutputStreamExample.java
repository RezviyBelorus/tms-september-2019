package lec_7.classwork.point_5;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    private static final String RELATIVE_PATH = "src/lec_7/classwork/text.txt";

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream(RELATIVE_PATH);
             BufferedOutputStream bf = new BufferedOutputStream(fos, 8)) {
            String text = "Hello!";
            for (int i = 0; i < 1000; i++) {
                bf.write(text.getBytes());
                bf.write(i);
                bf.write("\n".getBytes());
            }

            bf.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
