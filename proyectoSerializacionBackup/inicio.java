
package pqtcelular;

import java.io.IOException;

public class inicio {
    
    public static void main(String[] arg)throws IOException, ClassNotFoundException{
    
        persona[] per = new persona[3];
        
        per[0] = new persona(123, "jorge1");
        per[1] = new persona(124, "jorge2");
        per[2] = new persona(125, "jorge3");
        ///
        
        celular[] cel = new celular[4];
        
        cel[0] = new celular(1, 300, 100, "m1", per[0]);
        cel[1] = new celular(2, 301, 100, "m2", per[1]);
        cel[2] = new celular(3, 302, 100, "m1", per[2]);
        cel[3] = new celular(4, 303, 100, "m1", per[0]);
        
      
        String ar=backup.crearBackup(cel,2);
        System.out.println("Archivo "+ ar + " creado");
        
        backup bck = backup.cargarBackup(ar, cel);
        System.out.println("Archivo "+ ar + " cargado");
        
        for (int i = 0; i < bck.getLosCel().length; i++) {
            System.out.println(bck.getLosCel()[i].getCodigo()+"-"+bck.getLosCel()[i].getDuenio().getNombre());
        }//for
        
    }//main
    
    
}//class
