import java.io.*;
import java.util.*;

public class TryWithResources {

    static FileInputStream fi;

    static Scanner sc = new Scanner(System.in);
    static void Divide() throws Exception
    {
        fi = new FileInputStream("./test.txt");

        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a/b);

        fi.close();
    }
    public static void main(String[] args) throws Exception {
        Divide();
        int x = sc.nextInt();
        System.out.println(x);
    }
}
