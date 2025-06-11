import java.io.*;

public class FloatDataExample 
{
    // public static void main(String[] args) throws Exception
    // {
        
    //     float[] f = {10.5f,2.9f,6.4f,3.7f,4.6f};

    //     FileOutputStream fos = new FileOutputStream("K:/float.txt");

    //     DataOutputStream dos = new DataOutputStream(fos);

    //     dos.writeInt(f.length);
    //     for(float x : f) dos.writeFloat(x);

    //     fos.close();
    //     dos.close();
    // }    

    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("K:/float.txt");
        DataInputStream dis = new DataInputStream(fis);

        int len = dis.readInt();
        float data;

        for(int i=0;i<len;i++)
        {
            data = dis.readFloat();
            System.out.println(data);
        }

        fis.close();
        dis.close();
    }    
}
