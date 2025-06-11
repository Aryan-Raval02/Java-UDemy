import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile 
{
    public static void main(String[] args) 
    {
        try
        {
            FileInputStream fis = new FileInputStream("K:/source1.txt");

            byte[] b = new byte[fis.available()];
            fis.read(b);

            String str = new String(b);
            str = str.toLowerCase();

            FileOutputStream fos = new FileOutputStream("K:/source2.txt");
            fos.write(str.getBytes());

            fis.close();
            fos.close();

        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
