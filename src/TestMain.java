import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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


        List<Integer> list = new ArrayList<>();
        list.add(null);

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

    }
}