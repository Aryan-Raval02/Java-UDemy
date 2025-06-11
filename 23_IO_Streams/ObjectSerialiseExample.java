import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Customer23 implements Serializable
{
    String custID;
    String name;
    String phno;

    static int count = 1;

    Customer23(){}

    Customer23(String n, String p)
    {
        custID = "C"+count;
        count++;
        name = n;
        phno = p;
    }

    public String toString()
    {
        return "Customer ID : "+custID+"\nName : "+name+"\nPhone No : "+phno+"\n";
    }
}

public class ObjectSerialiseExample 
{
    // public static void main(String[] args) throws Exception
    // {
    //     Customer23 list[] = {
    //         new Customer23("Smith","782323423424"),
    //         new Customer23("John","5765725647"),
    //         new Customer23("Aryan","7875656542")
    //     };

    //     FileOutputStream fos = new FileOutputStream("K:/customer.txt");
    //     ObjectOutputStream oos = new ObjectOutputStream(fos);

    //     oos.writeInt(list.length);

    //     for(Customer23 c : list)
    //     {
    //         oos.writeObject(c);
    //     }

    //     oos.close();
    //     fos.close();
    // }    

    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("K:/customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Scanner sc = new Scanner(System.in);
        
        int length = ois.readInt();

        Customer23 list[] = new Customer23[length];

        for(int i=0;i<length;i++)
        {
            list[i] = (Customer23) ois.readObject();
        }

        System.out.print("Enter name of Customer : ");
        String name = sc.nextLine();

        for(int i=0;i<length;i++)
        {
            if(name.equalsIgnoreCase(list[i].name))
                System.out.println(list[i]);
        }

        ois.close();
        fis.close();
    }
}
