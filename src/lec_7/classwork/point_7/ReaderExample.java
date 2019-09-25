package lec_7.classwork.point_7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReaderExample {
    private static final String RELATIVE_PATH = "src/lec_7/classwork/text.txt";

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(RELATIVE_PATH)){
            System.out.println(fr.getEncoding());
            char[] buf = new char[100];

            int i;
            while ((i = fr.read(buf)) != -1) {
                System.out.println(Arrays.toString(buf));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Some IO exception. " + e.getMessage());
        }
    }
}
