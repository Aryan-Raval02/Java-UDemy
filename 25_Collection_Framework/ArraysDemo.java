import java.util.Arrays;

public class ArraysDemo 
{
    public static void main(String[] args) 
    {
        int a[] = {2,4,6,8,1,3,5,8};    
        int b[] = {2,4,6,8,1,3,5,8};
        
        System.out.println(Arrays.compare(a, b));

        System.out.println(Arrays.binarySearch(a, 8));

        int c[] = Arrays.copyOf(a, 4);

        Arrays.fill(c, 10); // All values of c fill with 10.

        Arrays.sort(a);

        for(int i:c) System.out.println(i);
    }    
}
