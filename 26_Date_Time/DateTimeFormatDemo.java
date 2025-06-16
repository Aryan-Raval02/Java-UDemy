import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeFormatDemo 
{
    public static void main(String[] args) 
    {
        LocalDateTime dt = LocalDateTime.now();
        
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy ss:mm:HH a");

        System.out.println(df.format(dt));

        System.out.println(dt.get(ChronoField.YEAR));
    }    
}
