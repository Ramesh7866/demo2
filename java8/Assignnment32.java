import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Assignnment32 {

public static void main(String[] args) {
//current date
LocalDate date = LocalDate.now();
System.out.println("The current date is: " + date);
//current time
LocalTime time = LocalTime.now();
System.out.println("The current time is: " + time);
//current date and time
LocalDateTime dateTime = LocalDateTime.now();
System.out.println("The local date and time is: " + dateTime);
//Print Date in a particular format
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-dd-MM HH:mm:ss");
LocalDateTime current = LocalDateTime.now();
String formatedDateTime = current.format(formatter);
System.out.println("The local formated date and time is: " + formatedDateTime);
//Print specified date
LocalDate IndependenceDay = LocalDate.of(1947, 7, 15);
System.out.println("Our Independence day is: " + IndependenceDay);
//Print Months day and seconds
Month month = current.getMonth();
int day = current.getDayOfMonth();
int seconds = current.getSecond();
System.out.println("Current -" + " Month: " + month + " Day: " + day + " Seconds: " + seconds);
}
}