public class producto {
    private int codigo;
    private int valor;
    public String nombre;

    public producto(int codigo, int valor, String nombre) {
        System.out.println("hola desde contructor producto");
        this.codigo = codigo;
        this.valor = valor;
        this.nombre = nombre;
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
