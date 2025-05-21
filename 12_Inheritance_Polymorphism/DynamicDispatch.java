class Super
{
    public void m1(){
        System.out.println("M1");
    }
    public void display(){
        System.out.println("Hello");
    }
}
class Sub extends Super
{
    @Override
    public void display(){
        System.out.println("Hello, World!");
    }
    public void m2(){
        System.out.println("M2");
    }
}
public class DynamicDispatch
{
    public static void main(String[] args) {
        Sub s = new Sub();
        s.m1();
        s.display();
        s.m2();

        Super su = new Sub();
        su.m1();
        su.display();
        //su.m2(); throws an error : cannot find symbol
    }
}