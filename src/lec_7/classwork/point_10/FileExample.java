package lec_7.classwork.point_10;

import java.io.File;

public class FileExample {
    private static final String PATH = "src/lec_7/classwork/point_9/object";
    private static final String PATH_TO_CREATE = "src/lec_7/classwork/point_9/myfile.txt";

    public static void main(String[] args) {
        File file = new File(PATH);

        System.out.println(file.exists());
        file.isDirectory();
    }
}
