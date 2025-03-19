package composicionfunciones;

import java.util.function.Function;

public class MathOperation2 {

    public static void main(String[] args) {
        Function<Integer, Integer> multipliBy3 = x->{
            System.out.println("Multiplico x: "+x+ "por 3");
            return x*3;
        };
            

        Function <Integer,Integer> add1MultipliBy3 = multipliBy3.compose(y->{
            System.out.println("Le adicione 1 a "+y);
            return y+1;
        });

        Function<Integer, Integer> andCuadrado = 
            add1MultipliBy3.andThen(x->{
                System.out.println("Elevando "+x+" al cuadrado");
                return x*x;
            });

        System.out.println(add1MultipliBy3.apply(5));
        System.out.println(andCuadrado.apply(3));
        
        
    }
    
}
