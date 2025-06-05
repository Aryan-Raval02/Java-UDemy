class MyData1
{
    int value = 0;
    boolean flag = true;

    synchronized void set(int v)
    {
        while(flag != true)
        {
            try{wait();}catch(Exception e){}
        }
        value = v;
        flag = false;
        notify();
    }

    synchronized int get()
    {
        int x = 0;

        while(flag != false)
        {
            try{wait();}catch(Exception e){}
        }

        x=value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread
{
    MyData1 d;

    Producer(MyData1 data)
    {
        d = data;
    }

    public void run()
    {
        int i = 1;
        while(true)
        {
            d.set(i);
            System.out.println("Producer : "+i);
            i++;
        }
    }
}

class Consumer extends Thread
{
    MyData1 d;
    Consumer(MyData1 data)
    {
        d = data;
    }  
    
    public void run()
    {
        while(true)
        {
            System.out.println("Consumer : "+d.get());
        }
    }
}

public class InterThreadCom {
    public static void main(String[] args) {
        MyData1 data1 = new MyData1();

        Producer producer = new Producer(data1);

        Consumer consumer = new Consumer(data1);

        producer.start();
        consumer.start();
    }
}
