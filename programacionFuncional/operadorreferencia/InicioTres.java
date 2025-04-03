package operadorreferencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class InicioTres{

    public static void main(String[] args) {
        
        Supplier<List> generador = new Supplier<List>() {

            @Override
            public List get() {
               return new ArrayList<>();
            }
            
        };


      //Supplier<List> generador = ()->new ArrayList<>();

      //Supplier<List> generador=ArrayList::new;

    }


}