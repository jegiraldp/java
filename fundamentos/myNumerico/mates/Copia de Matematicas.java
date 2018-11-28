
package mates;

public class Matematicas {
    static long factorial(int num){
        long resultado=1;
        while(num>0){
            resultado*=num;
            num--;
        }
        return resultado;
    }
    static long potencia(int base, int exponente){
        long resultado=1;
        for(int i=0; i<exponente; i++){
            resultado*=base;
        }
        return resultado;
    }
    static boolean esPrimo(int numero){
        if((numero!=2)&&(numero%2==0))     return false;
        for(int i=3; i<numero/2; i+=2){
            if(numero%i==0){
                return false;
            }
        }
        return true;
    }
    static double absoluto(double x){
        if(x<0) return -x;
        return x;
    }
    static int absoluto(int x){
        if(x<0) return -x;
        return x;
    }
}
