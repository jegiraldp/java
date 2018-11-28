public class nodo {
    
    private int valor;
    private nodo enlace;

    public nodo(int valor, nodo enlace) {
        this.valor = valor;
        this.enlace = enlace;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(nodo enlace) {
        this.enlace = enlace;
    }
    
    
}
