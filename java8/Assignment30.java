import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Assignment30 {

public static void main(String[] args) {
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
LocalDateTime current = LocalDateTime.now();
String formatedDateTime = current.format(dtf);
System.out.println("The local formatted date and time is: " + formatedDateTime);
}

}