import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(0,20);
        list.addAll(1,new ArrayList<Integer>(List.of(30,50,60,30,70,80,90)));

        System.out.println(list);

        System.out.println(list.contains(20));
        System.out.println(list.get(4));
        System.out.println(list.indexOf(30));
        System.out.println(list.lastIndexOf(30));

        list.set(2,60);

        System.out.println(list);

        System.out.println(list.subList(2, 6));

        // list.forEach((x)->{
        //     System.out.print(x+" ");
        // });

        //Iterator<Integer> it = list.iterator();
        // while(it.hasNext())
        // {
        //     System.out.print(it.next()+" ");
        // }

        //ListIterator<Integer> lit = list.listIterator();
        // while(lit.hasNext())
        // {
        //     System.out.print(lit.next()+" ");
        // }
        // System.out.println();
        // while(lit.hasPrevious())
        // {
        //     System.out.print(lit.previous()+" ");
        // }

        // for(ListIterator<Integer> l = list.listIterator();l.hasNext();)
        // {
        //     System.out.print(l.next()+" ");
        // }

        //list.forEach(n->System.out.println(n));
        //list.forEach(System.out::println);

        list.forEach(n->show(n));
    }

    static void show(int n)
    {
        if(n >=60)
        {
            System.out.print(n+" ");
        }
    }
}