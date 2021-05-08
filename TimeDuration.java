import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.*;


public class TimeDuration {

    public static void main(String[] args) {
        Period p1 = Period.ofWeeks(3);
        System.out.println(p1);
//adding duration to local date time.
        Duration d1 = Duration.ofDays(7);
        LocalDateTime localdtime = LocalDateTime.now();
        LocalDateTime finaldtime = localdtime.plus(d1); // adding d1 days
        System.out.println(finaldtime);

        //To print the date and time in particular format
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm");
        String yourpattern = finaldtime.format(df);
        System.out.println("Formatted date: "+yourpattern);
    }
}