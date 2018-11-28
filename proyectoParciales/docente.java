
public class docente extends persona{
    private int idDocente;

    public docente(int idDocente, int cedula, String nombre) {
        super(cedula, nombre);
        this.idDocente = idDocente;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    
    
    
}//class
