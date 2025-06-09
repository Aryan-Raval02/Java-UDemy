@FunctionalInterface
interface lambda
{
    public void display();
}

@FunctionalInterface
interface ParamLambda
{
    public void greet(String name);
}

@FunctionalInterface
interface Add
{
    public int add(int x, int y);
}
public class MyLambda
{
    public static void main(String[] args)
    {
        lambda l = ()->{
                System.out.println("Hello World!");
            };
        l.display();

        int a=10,b=5;

        lambda  su = ()->{
            System.out.println("Sum is : "+(a+b));
        };
        su.display();

        ParamLambda pl = (name) -> {
            System.out.println("Good Morning, "+name);
        };

        pl.greet("Aryan");

        Add sum = (x,y) -> {
            return x+y;
        };
        
        Add sum2 = (x,y) -> x+y;

        System.out.println("Sum is "+sum.add(10,20));
        System.out.println("Sum is "+sum2.add(2,5));
    }
}