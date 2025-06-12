import java.util.TreeMap;

public class TreemapDemo 
{
    public static void main(String[] args) 
    {
        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(1, "One");

        tm.put(2, "two");

        tm.put(3, "three");

        System.out.println(tm);

        System.out.println(tm.keySet());

        System.out.println(tm.containsKey(2));

        System.out.println(tm.containsValue("one"));
    }    
}
