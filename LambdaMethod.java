import java. util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main
{
    public static void main(String[] args)
    {
        Predicate<Integer> isEven=(n) -> n % 2==0;
        System.out.println(isEven.test(5));
        System .out.println(isEven.test(70));

        Supplier<String> message=() ->"Hello java Function Interface";
        System.out.println(message.get());

        Consumer<String> display= name ->
                System.out.println("WELCOME"+name);

        Function<Integer,Integer> square=num -> num * num;
        System.out.println("\nFunction Example:");
        System.out.println("square of 5:"+square.apply(5));
    }
}

