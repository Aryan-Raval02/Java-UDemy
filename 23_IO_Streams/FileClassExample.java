import java.io.File;

public class FileClassExample 
{
    public static void main(String[] args) throws Exception 
    {
        File f = new File("K:\\");

        System.out.println(f.isDirectory());
        
        File[] s = f.listFiles();

        for(File n : s) System.out.println(n.getName()+" "+f.getPath());
    }    
}
