import java.time.LocalDateTime;
// import java.time.LocalTime;
import java.time.LocalDate;
public class Localdatetime {
    public static void main(String [] arg){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate date = now.toLocalDate();
        System.out.println(date);
    }

}
