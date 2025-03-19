package optionals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class inicio {

    public static void main(String[] args) {
        List<String> names =getNames();
        if(names!=null){

        }

        Optional <List <String>> optionalNames = getOptionalNames();
        if(optionalNames.isPresent()){

        }

        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));

        
    }

    static List<String> getNames(){
        List<String> list = new LinkedList<>();
        //return list;        
        return Collections.emptyList();
    }

    static String mostValueablePLayer(){
        //return "";
        return null;
    }

    static int mostExpensiveItem(){
        return -1;

    }

    static Optional <List <String>> getOptionalNames(){
        List<String> nameList = new LinkedList<>();
        return Optional.of(nameList);

    }
    
}
