abstract class KFC
{
    public void makeItem(){
        System.out.println("Make Items");
    }
    public abstract void billing();
    public abstract void offer();

}
class MyKFC extends KFC{
    public void billing(){
        System.out.println("Billing");
    }
    public void offer(){
        System.out.println("Offer");
    }
    public void parsolPoint(){
        System.out.println("Parsol Point");
    }
}
public class AbstractClass
{
    public static void main(String[] args) {
        MyKFC obj = new MyKFC();
        obj.billing();
        obj.parsolPoint();
        obj.offer();
        obj.makeItem();
    }
}