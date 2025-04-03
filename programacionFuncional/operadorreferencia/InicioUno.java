package operadorreferencia;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class InicioUno {

    public static void main(String[] args) {
        List<String> profesores = getList("jorge","giraldo","plaza");
        Consumer<String> printer=texto-> System.out.println(texto);
        profesores.forEach(printer);

        profesores.forEach(System.out::println);
    }

    static <T> List<T> getList(T... elements){
        return Arrays.asList(elements);
    }
    
}
