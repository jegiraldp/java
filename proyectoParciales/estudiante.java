import java.io.Serializable;

public class estudiante extends persona /*implements Serializable*/{
    private int codigo;
    private estudiante enlace;

    public estudiante(int codigo, estudiante enlace, int cedula, String nombre) {
        super(cedula, nombre);
        this.codigo = codigo;
        this.enlace = enlace;
    }//constructor

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public estudiante getEnlace() {
        return enlace;
    }

    public void setEnlace(estudiante enlace) {
        this.enlace = enlace;
    }

 
}//class
