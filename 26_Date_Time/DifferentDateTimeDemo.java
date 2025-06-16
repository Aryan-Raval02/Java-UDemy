import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DifferentDateTimeDemo 
{
    public static void main(String[] args)
    {
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt);
    
        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);

        ZoneId zid = ZoneId.of("Asia/Kolkata");

        MonthDay md = MonthDay.now();
        System.out.println(md);
        
        Period p = Period.of(2, 2, 10);

        System.out.println(p.addTo(LocalDate.now()));

        Duration d = Duration.ofMinutes(30);
        System.out.println(d.addTo(LocalTime.now()));

        Instant i = Instant.now();
        System.out.println(i);
    }    
}
