package lec_7.classwork.point_8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    private static final String RELATIVE_PATH = "src/lec_7/classwork/text.txt";

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(RELATIVE_PATH);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Some IO exception. " + e.getMessage());
        }
    }
}
