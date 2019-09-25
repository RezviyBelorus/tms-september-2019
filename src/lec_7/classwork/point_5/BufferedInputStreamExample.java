package lec_7.classwork.point_5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {
    private static final String RELATIVE_PATH = "src/lec_7/classwork/text.txt";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(RELATIVE_PATH);
             BufferedInputStream bf = new BufferedInputStream(fis, 8)
        ) {
            long start = System.currentTimeMillis();

            byte[] buf = new byte[bf.available()];
            int i;

            while ((i = bf.read(buf)) != -1) {
                System.out.println(new String(buf, "UTF-8"));
            }

            long finish = System.currentTimeMillis();
            System.out.println("time: " + (finish - start));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
