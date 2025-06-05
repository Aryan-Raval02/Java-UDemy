public class YieldThread extends Thread
{
    public void run()
    {
        int i = 0;
        while(true)
        {
            System.out.println(i+" My World");
            i++;
        }
    }
    public static void main(String[] args) 
    {
        YieldThread yThread = new YieldThread();
        yThread.start();

        int i=0;
        while(true)
        {
            System.out.println(i+" Main");
            i++;
            Thread.yield();
        }
    }
}