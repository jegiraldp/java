package optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class inicioNota {

    public static void main(String[] args) {

        List<nota> notas = new ArrayList<nota>();

        notas.add(new nota("programacion1", 4.0));
        notas.add(new nota("programacion2", 3.5));
        notas.add(new nota("programacion3", 3.5));

        //
        nota laSobreSaliente = buscarSobresalientes(notas);
        if(laSobreSaliente!=null){
            System.out.println(laSobreSaliente.getValor());
            System.out.println(laSobreSaliente.getAsignatura());

        }else{
            System.out.println("No hay valor ");
        }
        
        Optional<nota> oNota = buscarSobresalientesOptional(notas);
        if(oNota.isPresent()){
            nota theNota = oNota.get();
            System.out.println(theNota.getAsignatura());
            System.out.println(theNota.getValor());
        }
        String a="default asignatura";
        double v =0.0;
        System.out.println(oNota.orElseGet(()-> new nota(a, v)));
        

        
    }

    static nota buscarSobresalientes(List<nota> lasNotas){
        nota nota = null;

        for(nota unaNota:lasNotas){
            if(unaNota.getValor()>=9){
                nota=unaNota;
            }
        }
        return nota;

    }

    static Optional<nota> buscarSobresalientesOptional(List<nota> lasNotas){
        for (nota lanota : lasNotas) {
            if (lanota.getValor()>=9) {
                return Optional.of(lanota);
            }
        }
        System.out.println("No hay valor Optional");
        return Optional.empty();
    }
    
}
