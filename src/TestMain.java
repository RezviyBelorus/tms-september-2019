import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;

public class TestMain {
    private static final String DIRECTORY = "src";

    public static void main(String[] args) {
        String s = new String("S");

        Class<? extends String> aClass = s.getClass();

        Constructor<?>[] constructors = aClass.getConstructors();


        Method[] declaredMethods = aClass.getDeclaredMethods();

        Method[] methods = aClass.getMethods();

        Deque<String> strings = new ArrayDeque<>();

        for (int i = 0; i < 200; i++) {
            strings.add(String.valueOf(i));
        }


        System.out.println(strings);




        Map<String, Integer> map = new TreeMap<>();
//        map.put(null, 1);

        map = new HashMap<>();
        map.put(null, 1);
        map.put("A", 22);
        map.put("B", 22);

        System.out.println(map);

        Collection<Integer> values = map.values();
        values.remove(22);
        values.remove(33);

        System.out.println(map);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(null);
        list.add(22);
        list.add(33);


    }
}