 import java.util.Optional;
public class Assignment34 {

public static void main(String[] args) {
String[] str = new String[10];
str[6]="keep your mind peace";
Optional<String> checkNull = Optional.ofNullable(str[6]);
if(checkNull.isPresent()) {
String lowercaseString= str[6].toLowerCase();
System.out.println(lowercaseString);
} else {
System.out.println("null");
}

}

}