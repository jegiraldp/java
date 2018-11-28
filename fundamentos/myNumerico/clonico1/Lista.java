

package clonico1;

public class Lista implements Cloneable{
    private int[] x;
    public int n;
    public String nombre;
    public Lista(int[] x, String nombre) {
        this.x=x;
        n=x.length;
        this.nombre=nombre;
    }
    public Object clone(){
        Lista obj=null;
        try{
            obj=(Lista)super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
        obj.x=(int[])obj.x.clone();
        return obj;
    }
    private void ordenar(){
        int aux;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(x[i]>x[j]){
                    aux=x[j];
                    x[j]=x[i];
                    x[i]=aux;
                }
            }
        }
    }
    public int menor(){
        Lista aux=(Lista)clone();
        aux.ordenar();
        return aux.x[0];
    }

    public int mayor(){
        ordenar();
        return x[n-1];
    }
   public String toString(){
        String texto=nombre;
        for(int i=0; i<n; i++){
            texto+="\t"+x[i];
        }
        return texto;
   }
}

