import java.util.ArrayList;

public class lista {
     static ArrayList<contacto> crearLista(String contactos){
         ArrayList<contacto> listaContactos= new ArrayList<>();
        String[] contacto=contactos.split(";");
        contacto c;
        String[] atributos;
         for (int i = 0; i < contacto.length; i++) {
            atributos=contacto[i].split(",");
            c= new contacto(atributos[0],atributos[1],atributos[2],atributos[3]);
            // System.out.println(c.getDocumento()+":"+c.nombre+":"+c.telefono+":"+c.foto);
            listaContactos.add(c);

         }
         return listaContactos;
    }
}
