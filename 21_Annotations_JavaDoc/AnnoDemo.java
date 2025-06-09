import java.lang.annotations.*;

@Retension(RetensionPolicy.CLASS)

@interface MyAnno
{
    String name();
    String version() default "1.3";
}

@MyAnno(nam="Aryan")
public class AnnoDemo
{
    int data;

    public static void main( String[] args)
    {
        int x;
    }
}