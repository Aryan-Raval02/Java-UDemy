import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;

class Student1 implements Serializable
{
    int rollno;
    String name;
    String dept;
}

public class DataOutputExample
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("K:/student.txt");

        DataOutputStream dos = new DataOutputStream(fos);

        Student1 s = new Student1();

        s.rollno = 123;
        s.name = "Aryan";
        s.dept = "IT";

        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);

        dos.close();
        fos.close();

    }
}