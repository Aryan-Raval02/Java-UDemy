import java.text.Format;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class JodaDateTimeDemo 
{
    public static void main(String[] args) 
    {
        LocalDate dt = LocalDate.now();
        LocalDate dt1 = LocalDate.now(Clock.systemDefaultZone());
        LocalDate dt2 = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        LocalDate dt3 = LocalDate.of(2004, Month.AUGUST, 16);
        LocalDate dt4 = LocalDate.ofEpochDay(0);
        LocalDate dt5 = LocalDate.parse("2020-01-03");

        System.out.println(dt);
        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println(dt3);
        System.out.println(dt4);
        System.out.println(dt5);

        LocalTime lt = LocalTime.now();

        System.out.println(lt);
        System.out.println(lt.plusHours(5));

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);
    }    
}
