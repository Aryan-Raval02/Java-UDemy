import java.util.HashSet;

public class HashSetDemo 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> hs = new HashSet<>();
        
        hs.add(10);
        hs.add(20);
        hs.add(30);

        System.out.println(hs.size());

        System.out.println(hs.isEmpty());

        System.out.println(hs.remove(10));

        System.out.println(hs.equals(10));
        //hs.add(10); //Duplicate value ignore by JVM itself.

        System.out.println(hs);
    }    
}
