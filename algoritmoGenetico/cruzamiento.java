
public class cruzamiento {
    
    
    public static float getAleatorio(){
       return new java.util.Random().nextFloat();
     }//
    
    public static gen[] getProb(gen[] gene,float pc){
       
       for (int i = 0; i < gene.length; i++) {
         gene[i].cruce=2;
         if(gene[i].sel==1 && gene[i].probC>pc){
              gene[i].cruce=1;
                 
             }//if
        
       }//for
       return gene;
  
   }//
    
    public static genAux[] ordenarV_cruce(genAux[] v){
        
         boolean band=true;
         genAux gAux_Aux;
         while(band){
             band=false;
                       
             for (int i = 0; i < v.length-1; i++) {
                
                if(v[i].prob<v[i+1].prob){
                  gAux_Aux=(genAux)v[i];
                  v[i]=v[i+1];
                  v[i+1]=gAux_Aux;
                  band=true;
                }//if                  
             }//for
          
         }//while
         return v;
     }//ordenarV
    
    
    public static String cruzar(String a, String b, int puntoCruce){
       // System.out.println("\npunto cruce: "+puntoCruce);
        String hijoR="";
        
        char[] va = a.toCharArray();
        char[] vb = b.toCharArray();
        char[] hijo=new char[va.length];
        
        for (int i = 0; i < hijo.length; i++) hijo[i]='-';
        
        for (int i = 0; i <=puntoCruce ; i++) {
            hijo[i]=va[i];
        }
        for (int j = puntoCruce+1; j<vb.length; j++) {
            hijo[j]=vb[j];
        }
        //System.out.print("\nhijo : ");
        for (int i = 0; i < hijo.length; i++) {
            hijoR+=hijo[i];
        }
        return hijoR;    
    }//cruzar
    
}//main
