interface Test2
{



void print(Integer p);



}
public class OneParameter
{
static void fun(Test2 t, Integer p)



{
// calls the print function



t.print(p);



}
public static void main(String[] args) {
fun(p -> System.out.println(p), 10);

}
}