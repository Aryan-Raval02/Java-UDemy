class Data<T>
{
    private T obj;

    public void setData(T v)
    {
        obj = v;
    }
    public T getData()
    {
        return obj;
    }
}

@SuppressWarnings("unchecked")
class MyArray<T>
{
    T A[] = (T[]) new Object[10];

    int length = 0;

    public void append(T v)
    {
        A[length++] = v;
    }
    public void display()
    {
        for(int k=0 ; k<length ; k++)
        {
            System.out.println(A[k]);
        }
    }
}

// We can declare multiple Paramterized Generic Class
class MultipleParam<K,V>
{

}

// Sub Type
//This class Allow Only String
class MyArray2 extends MyArray<String>
{

}

// MyArray3 becomes same as MyArray
class MyArray3<T> extends MyArray<T>{}


// Fixed range of Generic Type
// There we can define Number class as Generic Type or Its child Classes only.
class BoundType<T extends Number> 
{
    private T obj;

    public void setData(T v)
    {
        obj = v;
    }
    public T getData()
    {
        return obj;
    }
}

public class Generics 
{

    static <E> void show(E[] list)
    {
        for(E x : list) System.out.println(x);
    }

    static <E> void show2(E... list)
    {
        for(E x : list) System.out.println(x);
    }

    static void fun(MyArray obj)
    {
        obj.display();
    }

    //In place of Extends we can write super so only those class reference use which are super of defined.
    static void fun2(MyArray<? extends Number> obj)
    {
        obj.display();
    }

    public static void main(String[] args) 
    {
        Data<Integer> d = new Data<>();
        d.setData(10);
        System.out.println(d.getData());

        Data<String> d1 = new Data<>();
        d1.setData("Aryan");
        System.out.println(d1.getData());

        MyArray<Integer> my = new MyArray<>();

        my.append(10);
        my.append(15);
        my.append(20);

        my.display();

        MyArray<String> my2 = new MyArray<>();

        my2.append("Aryan");

        my2.display();

        //It becomes Object, We can store any type of objects. 
        // MyArray obj = new MyArray(); 

        // obj.append(10);
        // obj.append("AK");
        // obj.append(12.7f);

        // obj.display();

        //BoundType<Double> b = new BoundType<>();

        show(new String[]{"Hi","Go","Bye"});
        show2(10,20,30);

        fun(my);
        fun2(my);
    }
}
