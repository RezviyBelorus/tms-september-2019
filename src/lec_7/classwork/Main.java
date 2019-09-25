package lec_7.classwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/lec_7/classwork/text.txt")){
            byte[] buf = new byte[1];

            while (fis.read(buf) != -1) {
                System.out.println(Arrays.toString(buf));

                String s = new String(buf, "UTF-8");
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
