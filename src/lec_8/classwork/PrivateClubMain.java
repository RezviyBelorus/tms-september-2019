package lec_8.classwork;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrivateClubMain {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        PrivateClub privateClub = null;

        Class<?> aClass = Class.forName(PrivateClub.class.getName());

        Constructor<?> declaredConstructor = aClass.getDeclaredConstructors()[0];

        declaredConstructor.setAccessible(true);
        privateClub = (PrivateClub) declaredConstructor.newInstance("Alex");

        System.out.println(privateClub);
    }
}
