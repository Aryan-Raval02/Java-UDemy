import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExample 
{
    public static void main(String[] args) throws Exception
    {
        
        FileOutputStream fos = new FileOutputStream("K:/Object.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student1 s = new Student1();

        s.rollno = 143;
        s.name = "Bhulku";
        s.dept = "Prabodham";

        oos.writeObject(s);

        oos.close();
        fos.close();

    }
}
