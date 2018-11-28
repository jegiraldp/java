public class grupo {
    private int codigo;
    private curso asignatura;
    private docente profesor;
    private listaEstudiantesGrupo estudiantes;

    public grupo(int codigo, curso asignatura, docente profesor, listaEstudiantesGrupo estudiantes) {
        this.codigo = codigo;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public curso getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(curso asignatura) {
        this.asignatura = asignatura;
    }

    public docente getProfesor() {
        return profesor;
    }

    public void setProfesor(docente profesor) {
        this.profesor = profesor;
    }

    public listaEstudiantesGrupo getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(listaEstudiantesGrupo estudiantes) {
        this.estudiantes = estudiantes;
    }
    
}
