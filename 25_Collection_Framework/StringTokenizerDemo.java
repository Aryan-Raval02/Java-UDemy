import java.util.StringTokenizer;

public class StringTokenizerDemo 
{
    public static void main(String[] args) 
    {
        String data = "name=vijay;address=delhi;country=india;dept=sce";
          
        StringTokenizer stk = new StringTokenizer(data,";",true);

        while(stk.hasMoreTokens())
        {
            System.out.println(stk.nextToken());
        }
    }    
}
