public class persona {
    private int codigo;
    public String nombre;

    public persona(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void saludar(){
        System.out.println("Hola "+this.nombre);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
