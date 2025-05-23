class StaticOuter
{
    static int x = 10;
    int y = 20;

    static class StaticInner{
        void display(){
            System.out.println(x);
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        StaticOuter.StaticInner si = new StaticOuter.StaticInner();
        si.display();
    }    
}
