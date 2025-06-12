import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(0,20);
        list.addAll(1,new LinkedList<Integer>(List.of(30,50,60,30,70,80,90)));

        System.out.println(list);

        System.out.println(list.contains(20));
        System.out.println(list.get(4));
        System.out.println(list.indexOf(30));
        System.out.println(list.lastIndexOf(30));

        list.set(2,60);

        list.addFirst(1);
        list.addLast(100);

        System.out.println(list);

        System.out.println(list.peek());

        System.out.println(list.subList(2, 6));    
    }    
}
