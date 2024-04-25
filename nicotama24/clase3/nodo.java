public class nodo {
    int dato;
    nodo enlace;

    public nodo(int dato){
        this.dato=dato;
        this.enlace=null;
    }

    public nodo (int dato, nodo enlace){
        this.dato=dato;
        this.enlace=enlace;
    }
}
