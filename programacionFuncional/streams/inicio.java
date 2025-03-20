package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class inicio {

    public static void main(String[] args) {
        
        List<String> courseList = Arrays.asList("Java","Javascript","Python","Java MySQL");
        List<String> cursos = courseList.stream().map(curso->"PCJIC:"+curso)
        .collect(Collectors.toList());
        cursos.forEach(System.out::println);

        List<String> cursosJava = courseList.stream()
            .filter(curso->curso.contains("Java")).collect(Collectors.toList());
        
        cursosJava.forEach(System.out::println);


        Stream<String> cursosConAdminiracion = courseList.stream();
        cursosConAdminiracion.map(curso->curso+"!!")
        .filter(curso -> curso.contains("Java"))
        .forEach(System.out::println);

        //se puede utilizar parallel
        //revisar tema de collectors
         

    }
    
}
