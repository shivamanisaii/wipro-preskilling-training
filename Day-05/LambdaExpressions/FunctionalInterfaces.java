import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        Predicate<Integer> pred = x -> x > 18;

        System.out.println(pred.test(3));

        Function<Integer, Integer> func = input -> input * input * input;

        System.out.println(func.apply(3));
    }
}