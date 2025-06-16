import java.net.*;
import java.io.*;

public class Echo
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;

        do
        {
            msg = br.readLine();
            System.out.println(msg);
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();
            ps.println(msg);
        }while(!msg.equalsIgnoreCase("dne"));

        stk.close();
        ss.close();
    }
}


class Client
{
    public static void main(String[] args) throws Exception
    {
        Socket stk = new Socket("localhost",2000);

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;

        do
        {
            msg = userInput.readLine();
            ps.println(msg);

            msg = br.readLine();
            System.out.println("From Server : "+msg);

        }while(!msg.equalsIgnoreCase("dne"));

        stk.close();
    }
}
