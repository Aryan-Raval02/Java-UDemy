import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo 
{
    public static void main(String[] args)
    {
        Class c = String.class;

        Field field[] = c.getDeclaredFields();

        Constructor con[] = c.getConstructors();

        System.out.println(c.getClass());

        for(Field fi : field){
            System.out.println(fi);
        }

        for(Constructor c1 : con)
        {
            System.out.println(c1);
        }
    }
}
