
package pqtcelular;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class backup implements Serializable{
    
    private celular[] losCel;
    private int codigo;

    public backup(celular[] losCel, int codigo) {
        this.losCel = losCel;
        this.codigo = codigo;
    }

    public celular[] getLosCel() {
        return losCel;
    }

    public int getCodigo() {
        return codigo;
    }
    
    static String crearBackup(celular[] cel, int cod) throws IOException{
    String archivo="backup"+cod+".in";
    backup bck = new backup(cel, cod);
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo));
    out.writeObject(bck); 
    return archivo;
    }//crear
    
    static backup cargarBackup(String archivo, celular[] losCel) throws IOException, ClassNotFoundException{
     FileInputStream fis = new FileInputStream(archivo);
     ObjectInputStream ois = new ObjectInputStream(fis);
     backup cop = (backup) ois.readObject();//El método readObject() recupera el objeto
     ois.close();
     return cop;
    }//cargar
    
    
}//
