public class ExceptionDemo
{
    public static void main(String[] args) {
        int a=10, b=0, c;
        int num[] = {1,2,4,5,0};

        try{
            // c = a/b;
            // System.out.println("Division : "+c);
            c = num[0]/num[5];
        }
        // catch(ArithmeticException e){
        //     System.out.println("Divisible by Zero : "+e);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Array Index Bound : "+e);
        // }
        catch(Exception e)
        {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e);
        }

        System.out.println("End Of Program");

    }
}