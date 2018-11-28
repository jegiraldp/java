

package alumno;

public class Alumno {
    double nota;
    static double notaCorte=6.0;
    public Alumno(double nota) {
        this.nota=nota;
    }
    boolean estaAdmitido(){
        return (nota>notaCorte);
    }
} 