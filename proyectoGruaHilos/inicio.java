import java.io.IOException;
import java.util.Random;

public class inicio {
    static camion[] trucks, trucks2, trucks3;
    public static void main(String[] arg) throws IOException, InterruptedException{
        trucks=iniciar();
        trucks2=iniciar();
        trucks3=iniciar();
        
        grua g1 = new grua("g1", trucks);
        g1.start();
        grua g2 = new grua("g2", trucks2);
        g2.start();
        grua g3 = new grua("g3", trucks3);
        g3.start();
    }//main
       
    static camion[] iniciar(){
        Random rnd= new Random();
        camion[] trucks = new camion[10];
        for (int i = 0; i < trucks.length; i++) {
           trucks[i]= new camion((i+1),rnd.nextInt(5)+2);
            //System.out.println(trucks[i].id+"."+trucks[i].tDescarga);
            
        }
        System.out.println("---");
        return trucks;
    }//
}