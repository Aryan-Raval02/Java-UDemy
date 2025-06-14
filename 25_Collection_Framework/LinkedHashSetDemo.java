import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");
        lhs.add("B"); // It ignore by JVM

        System.out.println(lhs);
    }    
}
