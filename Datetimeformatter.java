import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalDate;
public class Datetimeformatter{
    public static void main(String [] arg){
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss a Z");
        String Format = now.format(format);
        System.out.println(Format);
        DateTimeFormatter ld = DateTimeFormatter.ofPattern("dd-MM-YY");
        LocalDate now1= LocalDate.now();
        LocalDate d = LocalDate.parse("25-04-2030",ld);
        System.out.println(d);
        String p = now1.format(ld);
        System.out.println(p);
        
    }
}