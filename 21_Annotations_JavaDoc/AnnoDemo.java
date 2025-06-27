import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@interface MyAnno
{
    String name();
    String version() default "1.3";
}

@MyAnno(name="Aryan")
public class AnnoDemo
{
    int data;

    public static void main( String[] args)
    {
        int x;
    }
}