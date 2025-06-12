import java.util.TreeSet;
import java.util.List;

@SuppressWarnings("rawtypes")
class Point implements Comparable
{
    int x;
    int y;

    Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public String toString()
    {
        return "X="+x+" Y="+y;
    }

    @Override
    public int compareTo(java.lang.Object o) 
    {
        Point p = (Point)o;
        if(this.x < p.x)
        {
            return -1;
        }
        else if(this.x < p.x)
        {
            return 1;
        }
        else
        {
            if(this.y < p.y)
            {
                return -1;
            }
            else if(this.y > p.y)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
}
public class TreeSetDemo 
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> ts = new TreeSet<>(List.of(50,30,90,60,100,10));

        ts.add(25);

        System.out.println(ts.floor(57));

        System.out.println(ts);

        TreeSet<Point> tsp = new TreeSet<>();

        tsp.add(new Point(1, 1));
        tsp.add(new Point(5,5));
        tsp.add(new Point(5, 2));

        System.out.println(tsp.toString());
    }    
}
