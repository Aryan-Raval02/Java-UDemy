class MyData
{
    // void display(String str)
    // {
    //     synchronized(this)
    //     {
    //         for(int i=0 ; i<str.length() ; i++)
    //         {
    //             System.out.print(str.charAt(i));
    //         }
    //     }
    // }

    synchronized void display(String str)
    {
         for(int i=0 ; i<str.length() ; i++)
         {
             System.out.print(str.charAt(i));
         }
    }
}
class MyThread1 extends Thread 
{
    MyData d;
    MyThread1(MyData data)
    {
        d = data;
    }
    public void run()
    {
        d.display("Hello World");
    }
}
class MyThread2 extends Thread 
{
    MyData d;
    MyThread2(MyData data)
    {
        d = data;
    }
    public void run()
    {
        d.display("Welcome");
    }
}
public class Monitor {
    public static void main(String[] args) {
        MyData d = new MyData();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        t1.start();
        t2.start();
    }
}
