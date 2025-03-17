package funciones;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions{
    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer,Integer>() {
            @Override
            public Integer apply(Integer x){
                return x*x;
            }
            
        };

        System.out.println(square.apply(5));
        Function<Integer, Boolean> isPar = x -> x%2==0;

        System.out.println(isPar.apply(4));

        Predicate<Integer> esPar = x->x%2==0;
        System.out.println(esPar.test(33));



    }
}