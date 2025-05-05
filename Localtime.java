import java.time.LocalTime;


public class Localtime {
    public static void main(String [] arg){
        LocalTime now = LocalTime.now();
        System.out.println(now);

    }
    
}
// 🔷 Common Methods of LocalTime

// Method	Description	Example
// now()	Current time	LocalTime.now()
// of(h, m) / of(h, m, s)	Create a specific time	LocalTime.of(14, 30)
// getHour(), getMinute()	Get time parts	time.getHour()
// plusMinutes(n)	Add minutes	time.plusMinutes(15)
// minusHours(n)	Subtract hours	time.minusHours(1)
// isBefore(), isAfter()	Time comparison	t1.isBefore(t2)
// withHour(n)	Change hour value	time.withHour(10)
// parse("HH:MM")	Convert string to time	LocalTime.parse("09:45")