public class String_SBuffer_SBuilder 
{
    public static void main(String[] args) 
    {
        String s1 = new String("Hello");

        StringBuffer s2 = new StringBuffer("Hello");

        StringBuilder s3 = new StringBuilder("Hello");

        s1.concat(" World");
        s2.append(" World!");
        s3.append(" Worlds !");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }    
}
