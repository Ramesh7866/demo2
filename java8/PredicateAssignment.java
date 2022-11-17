import java.util.function.Predicate;
public class PredicateAssignment16 {



public static void main(String[] args) {
Predicate<Integer> adult=i ->i >=18;
System.out.println(adult.test(12));
System.out.println(adult.test(19));
System.out.println(adult.test(21));
}
}