import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo 
{
    public static void main(String[] args) 
    {
        Hashtable<Integer,String> ht = new Hashtable<>();

        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");

        String s = (String)ht.get(3);
        System.out.println(s);

        Enumeration<String> e = ht.elements();

        ht.compute(2, (K,V) -> V+"Z");
        ht.computeIfAbsent(7, (K) -> "Z"+K);
        ht.computeIfPresent(2, (K,V) -> "X");

        // while(e.hasMoreElements())
        // {
        //     System.out.println(e.nextElement());
        // }

        System.out.println(ht);
    }    
}
