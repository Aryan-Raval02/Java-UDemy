import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputExample 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("K:/Object.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Student1 s;

        s = (Student1)ois.readObject();

        System.out.println(s.rollno+" "+s.name+" "+s.dept);
    }    
}
