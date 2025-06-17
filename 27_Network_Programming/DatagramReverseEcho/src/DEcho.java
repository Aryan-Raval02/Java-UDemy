import java.io.*;
import java.net.*;

//Client Logic
public class DEcho
{
    public static void main(String[] args) throws Exception
    {
        DatagramSocket ds = new DatagramSocket(2001);
        String msg = "Hello World";
        DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2000);

        // Send message to server
        ds.send(dp);

        // Receive message from server
        byte b[] = new byte[1024];
        dp = new DatagramPacket(b,1024);
        ds.receive(dp);

        // Print message
        msg = new String(dp.getData()).trim();
        System.out.println("From Server : "+msg);

        ds.close();
    }
}

class  Server
{
    public static void main(String[] args) throws Exception
    {
        DatagramSocket ds = new DatagramSocket(2000);
        DatagramPacket dp;

        // Receive message from Client
        byte b[] = new byte[1024];
        dp = new DatagramPacket(b,1024);
        ds.receive(dp);

        String msg = new String(dp.getData()).trim();
        System.out.println("From Client : "+msg);

        // Reverse the message using StringBuilder
        StringBuilder sb = new StringBuilder(msg);
        sb.reverse();
        msg = sb.toString();

        // Send message to Client
        dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2001);
        ds.send(dp);

        ds.close();
    }
}
