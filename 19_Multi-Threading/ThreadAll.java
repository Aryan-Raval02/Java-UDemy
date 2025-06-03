import java.lang.Thread;

public class ThreadAll extends Thread
{

    ThreadAll(String name)
    {
        super(name);
        //setPriority(Thread.MIN_PRIORITY+3);
    }

    @Override
    public void run()  {
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException IE){
                System.out.println(IE.getMessage());
            }
            i++;
        }
    }
    public static void main(String[] args) 
    {
        ThreadAll t  = new ThreadAll("My Thread");

        t.start();
        t.interrupt();
        // System.out.println(t.getId());
        // System.out.println(t.getName());
        // System.out.println(t.getPriority());
        // System.out.println(t.isDaemon());
        // t.start();
        // System.out.println(t.getState());
        
        // System.out.println(t.getThreadGroup());
        // System.out.println(t.isAlive());
        // t.setDaemon(true);
        // System.out.println(t.isDaemon());
    }
}