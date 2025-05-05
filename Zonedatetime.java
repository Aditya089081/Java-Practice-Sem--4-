import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
public class Zonedatetime {
    public static void main(String [] arg){
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Calcutta"));
        System.out.println(now);
        LocalDateTime dt = LocalDateTime.now();
        ZoneId zone = ZoneId.of("Asia/Calcutta");
        ZonedDateTime custom = ZonedDateTime.of(dt,zone);
        System.out.println(custom);
    }
}

// 🔷 Common Methods

// Method	Description
// now()	Current date-time with default zone
// now(ZoneId)	Current date-time in specified zone
// getZone()	Gets the time zone
// withZoneSameInstant()	Converts time to a different time zone
// toLocalDateTime()	Returns a LocalDateTime without zone
