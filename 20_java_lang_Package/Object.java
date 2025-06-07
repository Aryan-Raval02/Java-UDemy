import java.lang.*;

public class Object 
{
    public static void main(String[] args) 
    {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;

        System.out.println(o1.toString());
        System.out.println(o1.getClass());
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));

        System.out.println(o1.hashCode());
    }
}
