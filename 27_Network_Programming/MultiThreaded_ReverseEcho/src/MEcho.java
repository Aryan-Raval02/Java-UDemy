import java.net.*;
import java.io.*;

public class MEcho extends Thread
{
    Socket stk;

    MEcho(Socket stk)
    {
        this.stk = stk;
    }

    public void run()
    {
        try
        {
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

            System.out.println("Client Disconnected");

            stk.close();
            br.close();
            ps.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(2000);
        Socket stk;
        MEcho mre;

        System.out.println("Server has Started");

        do
        {
            stk = ss.accept();
            mre = new MEcho(stk);
            mre.start();

        }while (true);
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

        System.out.println("Client Disconnected");

        stk.close();
        userInput.close();
        br.close();
        ps.close();
    }
}
