import java.io.IOException;
import java.util.*;

public class inicioUno {
   
    static String impri="";
    static gen[] genes, gAux, gAux2;
    static float ps=(float)0.05;
    static float pc=(float)0.5;
    static float probMut=(float)0.5;
    static Random rnd;
    static int puntoCruce=0, numCruces, prom;
    
    //public static void main(String[] arg) throws InterruptedException, IOException{
        public static void iniciar() throws InterruptedException, IOException{
        rnd= new Random();
        prom=0;
       /* System.out.println("Probabilidad Selección::"+ps+"/////");
        System.out.println("Probabilidad Cruce::"+pc+"/////");
        System.out.println("Probabilidad Mutación::"+probMut+"/////");*/
        ////
        poblacionInicial();
        inicioIGU.txtArea.append(verPoblacionInicial());
        //System.out.println("\nPresione tecla para continuar");
        //System.in.read();
        ///
        int i=0;
        //for (int i = 0; i < 200; i++) {
            while(prom<31){
           
        ///
     // System.out.println("\n\n---Generación "+(i+1)+ " -- Mejor:"+prom);
        
        cruce();
        inicioIGU.txtArea.append("\n\n---Generación "+(i+1)+ " -- Mejor:"+(prom+1));
        inicioIGU.lblR.setText("\n\n---Generación "+(i+1)+ " -- Mejor:"+(prom+1));
        inicioIGU.txtArea.append("\n"+verPoblacion());
        
        nuevaGeneracion();
          /*  }else{
                inicioIGU.txtArea.append("---Generación "+(i+1)+ " -- Mejor:"+prom);
                inicioIGU.lblR.setText("\n\n---Generación "+(i+1)+ " -- Mejor:"+prom);
                i=200;
            }*/
           // Thread.sleep(50);
             i++; 
        }//while
        
           
    }//main
    
    //Población Inicial
    static void poblacionInicial(){
        genes= codificacion.poblacionInicial();
        genes=seleccion.inicial(genes, ps);
        genes=cruzamiento.getProb(genes,pc);
        numCruces=getNumeroCruces(genes);
        int cont=0;
        for (int ii = 0; ii < genes.length; ii++) {
            if(genes[ii].sel==1) {
                prom+=genes[ii].fenotipo;
                cont++;
            }
        }
        prom=prom/cont;
       
    }//
    
     //cruce
    static void cruce(){
        
        if(numCruces<2){
            
        }else{
        
        genAux[] gA= new genAux[numCruces];
        
        int j=0;
        for (int i = 0; i < genes.length; i++) {
              if(genes[i].cruce==1){
                gA[j]=new genAux(genes[i].id,genes[i].probC);  
                j++;
    
              }          
        }//for
        gA=cruzamiento.ordenarV_cruce(gA);
        
        
        for (int i = 0; i < genes.length; i++) {
                       
            if(genes[i].id==gA[0].id) genes[i].padre=1;
            if(genes[i].id==gA[1].id) genes[i].madre=1;
        }
        
         String genoPadre="",genoMadre="";
        for (int i = 0; i < genes.length; i++) {
           if(genes[i].padre==1)genoPadre=genes[i].genotipo;
           if(genes[i].madre==1)genoMadre=genes[i].genotipo;
        }
        puntoCruce=rnd.nextInt(3)+1;
        String h1= cruzamiento.cruzar(genoPadre, genoMadre,puntoCruce);
        String h2= cruzamiento.cruzar(genoMadre,genoPadre,puntoCruce);
        h1=mutacion.mutar(h1);
        h2=mutacion.mutar(h2);
        
        for (int i = 0; i < genes.length; i++) {
           if(genes[i].padre==1)genes[i].genotipo=h1;
           if(genes[i].madre==1)genes[i].genotipo=h2;
        }
        }//else;
        ////

    }//
    
    
    static void nuevaGeneracion(){
        prom=0;
    genes=codificacion.actualizarPoblacion(genes);
    genes=seleccion.inicial(genes, ps);
    genes=cruzamiento.getProb(genes,pc);
    numCruces=getNumeroCruces(genes);
    int cont=0;
        for (int ii = 0; ii < genes.length; ii++) {
            if(genes[ii].sel==1) {
                prom+=genes[ii].fenotipo;
                cont++;
            }
        }
        prom=prom/cont;
    
    }//
    
     static String verPoblacion(){
         impri="";
    for (int i = 0; i < genes.length; i++) {
            if(genes[i].sel==1){
            impri+=genes[i].id+":"+genes[i].genotipo+"("+genes[i].fenotipo+")"
                    + "(f(x):"+genes[i].valorAdaptacion+")"
                    + "(PS:"+genes[i].probSel+")(:"+genes[i].sel+")"
                    + "(PC:"+genes[i].probC+")(:"+genes[i].cruce+")"
                    + "(P:"+genes[i].padre+")(M:"+genes[i].madre+")\n";
            }//if
        }//for
    return impri;
    }//verP
     
      static String verPoblacionInicial(){
         impri="\n---Población Inicial ---\n";
    for (int i = 0; i < genes.length; i++) {
            
            impri+=genes[i].id+"-"+genes[i].genotipo+"("+genes[i].fenotipo+")"
                    + "(f(x):"+genes[i].valorAdaptacion+")"
                    + "(PS:"+genes[i].probSel+")(:"+genes[i].sel+")"
                    + "(PC:"+genes[i].probC+")(:"+genes[i].cruce+")"
                    + "(P:"+genes[i].padre+")(M:"+genes[i].madre+")\n";
            
        }//for
    return impri;
    }//verP
     
      static int getNumeroCruces(gen[] gg){
          int cont=0;
          for (int i = 0; i < gg.length; i++) {
              if(gg[i].cruce==1) cont++;
          }
      return cont;
      }//
    
}//class
