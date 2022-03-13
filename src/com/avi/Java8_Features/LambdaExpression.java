import java.util.function.BiConsumer;

public class LambdaExpression {

    public static void main(String[] args) {
        BiConsumer<Integer,Integer> bi= (a,b) -> System.out.println(a+b);
        bi.accept(22,11);
    }
}
