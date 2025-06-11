import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("K:/Test.txt");
            String str = "Learn Java Programming";

            fos.write(str.getBytes());

            //byte b[] = str.getBytes();

            // for(byte x : b){
            //     fos.write(x);
            // }

            //fos.write(b,6,str.length()-6);

            fos.close();
        }
        catch(FileNotFoundException e){ System.out.println(e); }
        catch(IOException e){ System.out.println(e); }
    }
}