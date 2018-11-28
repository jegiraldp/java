

package lista;

public class Lista {
    int[] x;     //array de datos
    int n;      //dimensión
    public Lista(int[] x) {
        this.x=x;
        n=x.length;
    }
    double valorMedio(){
        int suma=0;
        for(int i=0; i<n; i++){
            suma+=x[i];
        }
        return (double)suma/n;
    }
    int valorMayor(){
        int mayor=x[0];
        for(int i=1; i<n; i++){
            if(x[i]>mayor)  mayor=x[i];
        }
        return  mayor;
    }
    int valorMenor(){
        int menor=x[0];
        for(int i=1; i<n; i++){
            if(x[i]<menor)  menor=x[i];
        }
        return  menor;
    }
    void ordenar(){
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
    void imprimir(){
        ordenar();
        for(int i=0; i<n; i++){
            System.out.print("\t"+x[i]);
        }
        System.out.println("");
    }
}
