
import java.util.List;
import java.util.Arrays;
public class Assignment20 {
public static void main(String[] args) {
List<String> name=Arrays.asList("john","Sweety","Pandu","Sneha","Kiran","null");
name.stream().filter(n->n!=null).forEach((n)->System.out.println(n));
name.stream().filter(n->n.startsWith("a")).forEach((n)->System.out.println("startsWith a:"+n));
name.stream().filter(n->n.contains("n")).forEach((n)->System.out.println("contains n:"+n));
}
}

