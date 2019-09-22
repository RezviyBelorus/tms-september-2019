public class TestMain {
    public static void main(String[] args) {
        int[] ints = new int[10];

        try {
            System.out.println(ints[10]);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

            return;
        } finally {
            System.out.println("Return?! Pfff");
        }

        try {
            int anInt = getInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("after try-catch");
    }

    private static int getInt() throws Exception {
        int result = (int) (Math.random() * 100);

        if (result < 10) {
            throw new RuntimeException("result < 10");
        } else {
            return result;
        }
    }
}
