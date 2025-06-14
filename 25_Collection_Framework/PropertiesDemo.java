import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo 
{
    public static void main(String[] args) throws Exception
    {
        Properties p = new Properties();
        
        // p.setProperty("Name", "Lenovo Ideapad Gaming 3");
        // p.setProperty("Brand", "Lenovo");
        // p.setProperty("Processor", "i5 11 gen");
        // p.setProperty("OS","Windows 11");

        // p.store(new FileOutputStream("K:/Properties.txt"),"My Laptop");
        // p.storeToXML(new FileOutputStream("K:/Properties.xml"),"My Laptop");

        //p.loadFromXML(new FileInputStream("K:/Properties.xml"));
        p.load(new FileInputStream("K:/Properties.txt"));

        System.out.println(p.getProperty("Brand"));
    }    
}
