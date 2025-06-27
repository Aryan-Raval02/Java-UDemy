import java.util.Date;
import java.util.TimeZone;
import java.util.Calendar; // Abstract Class
import java.util.GregorianCalendar;

public class DateDemo 
{
    public static void main(String[] args) 
    {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000);
        System.out.println(System.currentTimeMillis()/1000/60);
        System.out.println(System.currentTimeMillis()/1000/60/60);
        System.out.println(System.currentTimeMillis()/1000/60/60/24);
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);

        System.out.println(Long.MAX_VALUE);

        Date d = new Date();
        Date d1 = new Date("1/1/1980");

        Date d2 = new Date(2004, 8, 16);

        System.out.println(d);

        System.out.println("Birth Date : "+d2.getMonth());

        GregorianCalendar gc = new GregorianCalendar();

        System.out.println(gc.get(Calendar.LONG_FORMAT));

        // TimeZone tz = gc.getTimeZone();

        // System.out.println(tz.getID());
        // System.out.println(tz);
        // System.out.println(tz.getDisplayName());
    }    
}
