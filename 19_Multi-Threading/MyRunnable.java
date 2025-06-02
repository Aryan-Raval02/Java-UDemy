public class MyRunnable implements Runnable{
    public void run()
    {
        int i=1;
        while(i<=50)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }
    public static void main(String[] args) 
    {
        MyRunnable m = new MyRunnable();
        Thread thread = new Thread(m);
        thread.start();
        
        int i=1;
        while(i<=50)
        {
            System.out.println(i+" World");
            i++;
        }
    }
}
