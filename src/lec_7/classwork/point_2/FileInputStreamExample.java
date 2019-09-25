package lec_7.classwork.point_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamExample {

    private static final String RELATIVE_PATH = "src/lec_7/classwork/text.txt";

    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(RELATIVE_PATH);
            byte[] buf = new byte[10];
            System.out.println(Arrays.toString(buf));
            int i;

            while ((i = fis.read(buf)) != -1) {
                System.out.println(Arrays.toString(buf));
                System.out.println("i=" + i);
                System.out.println("char=" + (char)buf[0]);
                System.out.println("content = " + new String(buf, "UTF-8"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
