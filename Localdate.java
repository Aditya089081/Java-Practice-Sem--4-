import java.time.LocalDate;
import java.util.Scanner;
public class Localdate {
    public static void main(String [] arg){
        Scanner input = new Scanner(System.in);
        LocalDate now = LocalDate.now();
        System.out.println(now);
        int year = now.getYear();
        System.out.println(year);
        LocalDate custom = LocalDate.of(2004,12,2);
        int y = custom.getYear();
        System.out.println(custom);
        System.out.println(y);
        System.out.println(now.isLeapYear());
        String date = input.nextLine();
        LocalDate d = LocalDate.parse(date);
        System.out.println(d);
        input.close();
    }
}
