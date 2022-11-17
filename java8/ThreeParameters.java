interface Test4 {



void print(Integer p1, Integer p2, Integer p3);



}
public class ThreeParameters {
static void fun(Test4 t, Integer p1, Integer p2, Integer p3)



{



// calls the print function



t.print(p1, p2, p3);



}
public static void main(String[] args) {
fun((p1, p2, p3)-> System.out.println(p1 + " " + p2 + " " + p3),10, 20, 30);



}



}