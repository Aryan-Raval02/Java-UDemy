class Outer
{
    int x = 10;

    class Inner
    {
        int y = 20;
        void innerDisplay()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }

    void outerDisplay()
    {
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}

public class NestedInnerClass
{
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerDisplay();

        Outer.Inner inner = new Outer(). new Inner();
        inner.innerDisplay();
    }
}