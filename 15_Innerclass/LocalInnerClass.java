class LocalOuter
{
    int x = 10;

    void outerDissplay()
    {
        class LocalInner
        {
            int y = 20;
            void innerDisplay()
            {
                System.out.println(x+"..."+y);
            }
        }
        LocalInner li = new LocalInner();
        li.innerDisplay();
    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        LocalOuter lo = new LocalOuter();
        lo.outerDissplay();
    }
}
