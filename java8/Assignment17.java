
import java.util.Map;
import java.util.HashMap;
public class Assignment17 {
public static void main(String[] args) {
Map<Integer,String> map=new HashMap <Integer, String>();
map.put(1, "java");
map.put(2, "full stack");
map.forEach((k,v) -> System.out.println("Number "+ k + ", training: " + v));
}
}

