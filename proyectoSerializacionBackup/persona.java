
package pqtcelular;

import java.io.Serializable;


public class persona implements Serializable{
    
    private int cedula;
    private String nombre;

    public persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
