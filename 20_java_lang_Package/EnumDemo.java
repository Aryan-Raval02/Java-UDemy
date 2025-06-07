
enum Dept
{
    CS,IT,CIVIL,ECE
}

public class EnumDemo
{
    public static void main(String[] args) 
    {
        Dept d = Dept.CS;

        System.out.println(d);
        System.out.println(d.ordinal());
        System.out.println(d.name());
        System.out.println(d.getClass());
        System.out.println(d.compareTo(Dept.CIVIL));
        System.out.println(d.hashCode());
        System.out.println(d.toString());
        System.out.println(Dept.values());
        System.out.println(Dept.valueOf("CS"));
    }
}