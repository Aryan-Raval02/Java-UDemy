public class Printing
{
    public static void main(String[] args) {
        int x=10,y=20;

        System.out.println(x+y+" Sum");

        System.out.println("Sum "+x+y);

        System.out.println("Sum "+(x+y));

        System.out.println("Sum of "+x+" and "+y+" is "+(x+y));

        float z=12.56f;
        char c = 'A';

        System.out.printf("Hello %d %f %c World\n",x,z,c);
        System.out.printf("Hello %o %e %c World\n",x,z,c);
        System.out.printf("Hello %x %g %c World\n",x,z,c);

        //argument index
        System.out.printf("Hello %1$d %2$f %3$c %1$d World\n",x,z,c);

        //use of width
        System.out.printf("%5d\n",x);

        //use of flag
        System.out.printf("%05d\n",x);
        System.out.printf("%(5d\n",-10);
        System.out.printf("%+5d\n",x);
        System.out.printf("%-5d\n",x);
        System.out.printf("% 5d\n",x);
        System.out.printf("% 10.3f\n",z);

    }
}