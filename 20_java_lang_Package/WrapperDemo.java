public class WrapperDemo 
{
    public static void main(String[] args) 
    {
        Integer i = new Integer(10);
        Integer i1 = Integer.valueOf(10);
        Integer i2 = 10; // This called internally Integer.valueOf().
        Integer i3 = new Integer("10");
        
    }    
}
