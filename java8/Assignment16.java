import java.util.function.*;
public class Assignment16
{
public static void main(String[] args) {
SimpleConsumerExample sce = new SimpleConsumerExample();
sce.accept(new Long(4));
Consumer<Long> innerConsumer= new Consumer<Long>() {
public void accept(Long t) {
System.out.println(t*t);
}
};
innerConsumer.accept(new Long(5));
Consumer<Long>lambdaConsumer=(Long t) -> System.out.println(t*t);
lambdaConsumer.accept(new Long(6));
Consumer<Long> conciseLambda= t -> System.out.println(t*t);
conciseLambda.accept(new Long(6));
}
}
class SimpleConsumerExample implements Consumer<Long> {
public void accept(Long t) {
System.out.println(t*t);
}
}