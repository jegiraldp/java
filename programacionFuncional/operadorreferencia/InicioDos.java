package operadorreferencia;

import java.util.Arrays;
import java.util.List;

public class InicioDos {

    public static void main(String[] args) {
        List<String> theList = Arrays.asList("Hugo","Paco","Luis","Donald");
        String word="Paco";

        theList.stream()
        .filter(p->word.equals(p))  //.filter(word::equals)
        .map(p->p.toUpperCase())
        .map(p->p.replace("", "_"))
        .forEach(System.out::println);  //.forEach(p->System.out.println(p));
    }
    
}
