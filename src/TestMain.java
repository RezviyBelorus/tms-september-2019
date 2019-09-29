import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestMain {
    private static final String DIRECTORY = "src";

    public static void main(String[] args) {
        String s = new String("S");

        Class<? extends String> aClass = s.getClass();

        Constructor<?>[] constructors = aClass.getConstructors();


        Method[] declaredMethods = aClass.getDeclaredMethods();

        Method[] methods = aClass.getMethods();
    }
}