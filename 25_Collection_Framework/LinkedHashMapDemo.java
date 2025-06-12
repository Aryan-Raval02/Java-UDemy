import java.util.LinkedHashMap;

public class LinkedHashMapDemo 
{
    public static void main(String[] args) 
    {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        lhm.put(6,"F");

        System.out.println(lhm);
    }    
}
