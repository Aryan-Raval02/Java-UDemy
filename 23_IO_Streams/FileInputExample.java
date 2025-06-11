import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample
{
    public static void main(String[] args) 
    {
        try(FileInputStream fis = new FileInputStream("K:/Test.txt");
)
        {
            
            // byte b[] = new byte[fis.available()];
            // fis.read(b);

            // String str = new String(b);
            // System.out.println(str);

            int x=fis.read();
            while(x!=-1)
            {
                System.out.print((char)x);
                x=fis.read();
            }
        }
        catch(FileNotFoundException e){ System.out.println(e); }
        catch(IOException e){ System.out.println(e); }
    }
}
