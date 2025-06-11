import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputExample 
{
    public static void main(String[] args) throws Exception
    {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');
        bos.write('f');
        bos.write('g');
        bos.write('h');
        bos.write('i');
        bos.write('j');

        // byte b[] = bos.toByteArray();
        // for(byte x : b) System.out.println((char)x);

        bos.writeTo(new FileOutputStream("K:/ByteArray.txt"));

        bos.close();
    }    
}
