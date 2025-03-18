package operatorbifunction;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class inicio {
    public static void main(String[] args) {
        UnaryOperator<String> quote = texto -> "\""+texto+"\"";
        System.out.println(quote.apply("Jorge"));

        BiFunction<Integer, Integer, Integer> multiplica =
            (x,y)->x*y;

        System.out.println(multiplica.apply(3, 4));

        BiFunction<String,Integer,String> leftPad =
            (texto, numEspacios) -> String.format("%"+numEspacios+"s", texto);

        System.out.println(leftPad.apply("java", 10));


    }
}
