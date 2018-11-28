
import java.util.Random;

public class codificacion {
    static float sumaFx;
    static java.util.Random rnd= new Random();

    public static String decimalToBinary(int decimal) {
        
        
        int[] numB ={0,0,0,0,0};
        int residuo=0;
        int cociente=99;
        String num="";
        
        int pos = numB.length-1;
                      
        while(cociente!=0){
            cociente=decimal/2;
            residuo=decimal % 2;
            numB[pos]=residuo;
            decimal=cociente;
            pos--;
        }
        
        for (int i = 0; i < numB.length; i++) {
           num+=numB[i];
        }
        return num;
        
    }
    
    public static gen[] poblacionInicial(){
        sumaFx=0;
        gen[] pob = new gen[32];
        
        for (int i = 0; i < pob.length; i++){
            pob[i]= new gen((i+1),i,decimalToBinary(i),optimizacion.funcionObj(i));
            sumaFx+=pob[i].valorAdaptacion;
            pob[i].probC=cruzamiento.getAleatorio();
        }
     
        for (int i = 0; i < pob.length; i++) {
          pob[i].probSel=(float)pob[i].valorAdaptacion/sumaFx;
        }//
        sumaFx=0;
        return pob;
    }
    
    public static gen[] actualizarPoblacion(gen[] p){
        sumaFx=0;
        for (int i = 0; i < p.length; i++) {
            p[i].madre=0;
            p[i].padre=0;
            p[i].fenotipo=codificacion.binaryToDecimal(p[i].genotipo);
            p[i].valorAdaptacion = optimizacion.funcionObj(p[i].fenotipo);
            sumaFx+=p[i].valorAdaptacion;
            p[i].probC=cruzamiento.getAleatorio();
           
        }
        for (int i = 0; i < p.length; i++) {
          p[i].probSel=(float)p[i].valorAdaptacion/sumaFx;
        }//
        sumaFx=0;
        return p;
    }//
    
  
   
   public static int binaryToDecimal(String binario) {
       
       double exponente=4;
       int num=0;
       String nume="";
       int entero=0;
       char[] bina=binario.toCharArray();
       
       
       for (int i = 0; i < bina.length; i++) {
           nume =String.valueOf(bina[i]);
           num=Integer.parseInt(nume);
           entero+=(num*Math.pow(2, exponente));
           exponente--;
       }
       
       return entero;
   }//binarytoDecimal

}//