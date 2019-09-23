import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер квадратного массива (нечетное число):");
        int size = sc.nextInt();
        while (size % 2 == 0) {
            System.out.println("Число должно быть нечетным:");
            size = sc.nextInt();
        }
        sc.close();
        int myInt[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                /*
                не делай таких длинных конструкций, они нечетаемы.
                */
                if (i == 0 || i == size - 1 || (i <= size / 2 && j >= i && j <= size - i - 1) || (i > size / 2 && j >= size - i - 1 && j <= i)) {
                    myInt[i][j] = 1;
                }
                System.out.print(myInt[i][j]);
            }
            System.out.println();

        }
    }
}