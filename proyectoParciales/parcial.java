
public class parcial {
    private int mes;
    private int dia;
    private String hora;
    private grupo grupo;
    private String supervisor;
    private String aula;

    public parcial(int mes, int dia, String hora, grupo grupo, String supervisor, String aula) {
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.grupo = grupo;
        this.supervisor = supervisor;
        this.aula = aula;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(grupo grupo) {
        this.grupo = grupo;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getFecha(){
        return this.mes+"/"+this.dia;
    }
}//class
