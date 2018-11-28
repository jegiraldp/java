
package pqtCelular;

public class hiloTablero extends Thread{
    
    private int lap;
    
    public hiloTablero(String n, int lap){
        setName(n);
        this.lap=lap;
        start();
    }//
    
    public void run(){
        
        String t;
           for (int i = 0; i < 60; i++) {
              ;
               t="";
               t+="\tID\tSaldo\tEstado\tEvento\n";
               for (int j = 0; j < inicio.hilos.length; j++) {
               t+="\t"+inicio.hilos[j].getNumero()+"\t"+inicio.hilos[j].getSaldo()+
                       "\t"+inicio.hilos[j].getEstado()+"\t"+inicio.hilos[j].getEvento()+"\n";    
                   
               }
               
               inicio.writeAreaReporte(t);
               
            try {
                sleep(lap);
            } catch (InterruptedException ex) {
                
            }
            
           /* if(i==5 || i==15){

                simulacion.saldo+=200;
                
            }*/
               
        }//for
    
    }//run
    
}
