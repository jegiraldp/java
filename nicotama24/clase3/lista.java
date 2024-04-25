import java.util.Scanner;

public class lista {

    public nodo cabeza;
    public lista laLista;
    public int dato;

    public lista(int nn){
        this.cabeza=null;
       crearLista(nn);
    }
    //////// crearLista
     public lista crearLista(int numNodos){
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < numNodos; i++) {
            System.out.print("\nDigite dato nodo "+(i+1)+" -> ");
            dato=scn.nextInt();
            this.cabeza= new nodo(dato,this.cabeza);
        }
      return laLista;
    }
    ///////////
    /////////// verLista
    public void verLista(){
            while(this.cabeza!=null){
                System.out.println(this.cabeza.dato);
                this.cabeza=this.cabeza.enlace;
            }
    }

}
