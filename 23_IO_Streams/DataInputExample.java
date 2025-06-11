import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputExample 
{
    public static void main(String[] args) throws Exception
    {
        
        FileInputStream fis = new FileInputStream("K:/student.txt");

        DataInputStream dis = new DataInputStream(fis);

        Student1 s = new Student1();

        s.rollno = dis.readInt();
        s.name = dis.readUTF();
        s.dept = dis.readUTF();

        System.out.println(s.rollno+" "+s.name+" "+s.dept);

    }    
}
