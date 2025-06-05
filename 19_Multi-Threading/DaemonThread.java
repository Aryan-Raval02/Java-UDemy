public class DaemonThread extends Thread
{
    public void run()
    {
        int count = 1;
        while(true)
        {
            System.out.println(count++);
        }
    }
    public static void main(String[] args) 
    {
        DaemonThread t = new DaemonThread();
        t.setDaemon(true);
        t.start();

        // try
        // {
        //     t.sleep(100);
        // }
        // catch(Exception ex)
        // {
        //     System.out.println(ex.getMessage());
        // }

        // Thread mainThread = Thread.currentThread();
        // try{mainThread.join();}catch(Exception e){}
    }
}
