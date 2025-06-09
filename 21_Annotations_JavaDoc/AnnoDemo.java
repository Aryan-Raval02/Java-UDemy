@interface MyAnno
{
    String name();
}

@MyAnno(nam="Aryan")
public class AnnoDemo
{
    @MyAnno(name="Aryan")
    int data;

    @MyAnno(name="Aryan")
    public static void main(@MyAnno(name="Aryan") String[] args)
    {
        @MyAnno(name="Aryan")
        int x;
    }
}