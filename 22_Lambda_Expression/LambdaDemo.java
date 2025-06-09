@FunctionalInterface
interface LambdaEx
{
    public void display();
}

class UseLambda
{
    public void callLambda(LambdaEx lx)
    {
        lx.display();
    }
}

class Demo
{
    public void method1()
    {
        UseLambda ul = new UseLambda();
        //ul.callLambda(() -> {System.out.println("From Lambda Expression");});
        ul.callLambda( () -> {
            System.out.println("From Lambda Expression");
        });
    }
}

public class LambdaDemo
{
    public static void main(String[] args)
    {
        Demo d = new Demo();
        d.method1();
    }

}