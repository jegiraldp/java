public class servicio {
    private int codigo;
    private int valor;
    public String nombre;

    public servicio(int codigo, int valor,String nombre) {
        this.codigo = codigo;
        this.valor = valor;
        this.nombre=nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
