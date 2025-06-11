import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceInoutExample 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis1 = new FileInputStream("K:/source1.txt"); 
        FileInputStream fis2 = new FileInputStream("K:/source2.txt");
        
        FileOutputStream fos = new FileOutputStream("K:/Destination.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);

        int b = sis.read();
        while(b!=-1)
        {
            fos.write(b);
            b=sis.read();
        }

        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
    }    
}
