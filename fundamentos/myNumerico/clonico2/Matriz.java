

package clonico2;
//clonar un objeto con un array bidimensional

public class Matriz implements Cloneable{
    private int[][] x;
    public int n;
    public Matriz(int[][] x) {
        this.x=x;
        n=x.length;
    }
    public Object clone(){
        Matriz obj=null;
        try{
            obj=(Matriz)super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
        obj.x=(int[][])obj.x.clone();
        for(int i=0; i<obj.x.length; i++){
            obj.x[i]=(int[])obj.x[i].clone();
        }
        return obj;
    }
    public void modificar(){
       for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                x[i][j]=x[j][i]+i-j;
            }
       }
    }

   public String toString(){
        String texto="";
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
            texto+="\t"+x[i][j];
            }
            texto+="\n";
        }
        texto+="\n";
        return texto;
   }
}

