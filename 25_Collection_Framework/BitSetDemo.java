import java.util.BitSet;

public class BitSetDemo 
{
    public static void main(String[] args) 
    {
        BitSet bs = new BitSet();
        
        bs.set(0);
        bs.set(1);
        bs.clear(2);
        bs.clear(3);
        bs.clear(4);
        bs.set(5);
        bs.set(6);
        bs.set(7);

        System.out.println(bs);
        bs.flip(0,8);
        System.out.println(bs);
    }    
}
