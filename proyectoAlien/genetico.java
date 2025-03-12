import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class genetico {
    static Random r;
    static boolean bnd;

    public static void main(String[] args) {
        System.out.println("hola");
    }
    

    public static double calcularFuerza(double v, double f, double a){
        int escala=10;
        double t = (double) (200*escala)/(v-a);
        double velTotal =v-f;
        double fuerza = Math.abs((double) 1/(velTotal/t));
        return fuerza;
    }

    public static List<Double> getIndividuo() {
        r = new Random();
        List<Double> individuo = new ArrayList<>();
        double velo=Math.abs(Math.round(r.nextInt(10)+10));
        double frena=Math.round(r.nextInt(10)+1);
        double ava=Math.round(r.nextInt(10)+5);
        individuo.add(velo); //velocidad
        individuo.add(frena); // frenado
        individuo.add(ava); //avance
        individuo.add(calcularFuerza(velo,frena,ava));
        return individuo;
    }

    public static List<List<Double>> getPoblacion(int tam){
        List<List<Double>> poblacion = new ArrayList<>();
        for (int i = 0; i < tam; i++) {
            poblacion.add(getIndividuo());
        }
        return poblacion;
    }

    public static List<List<Double>> nuevaPoblacionAndMutate(List<Double> nuevoPadre, int tamanio){
        List<List<Double>> newPoblacion = new ArrayList<>();
        double  numAleatorio = 0.0;
        double newValueVel=0.0;
        double newValueFre=0.0;
        double newValueAva=0.0;
        
        
        for (int i = 0; i < tamanio; i++) {
           
            List<Double> newIndividuo = new ArrayList<Double>();
            numAleatorio= r.nextDouble();
                       
            newValueVel=Math.abs(Math.round(nuevoPadre.get(0)+0.1));
            newValueFre=Math.abs(Math.round(nuevoPadre.get(1)+0.1));

            if(nuevoPadre.get(2)>2){
                newValueAva=nuevoPadre.get(2)-numAleatorio;
            }else{
                newValueAva=nuevoPadre.get(2);
            }
            
                                 
            newIndividuo.add(newValueVel);
            newIndividuo.add(newValueFre);
            newIndividuo.add(newValueAva);
            newIndividuo.add(calcularFuerza(newValueVel, newValueFre, newValueAva));
            newPoblacion.add(newIndividuo);
            
        }
        return newPoblacion;
    }

    public static List<List<Double>> ordenarLista(List<List<Double>> laPoblacion){
        laPoblacion.sort(Comparator.comparing(sublista -> sublista.get(3)));
        return laPoblacion;
    }

    public static List<Double> cruzarList(List<Double> theListM1,List<Double> theListM2){
        List<Double> mixed = new ArrayList<>();
        double theVel = Math.abs(Math.round((theListM1.get(0)+theListM2.get(0))/2));
        double theFre = Math.abs(Math.round((theListM1.get(1)+theListM2.get(1))/2));
        double theAva = Math.abs(Math.round((theListM1.get(2)+theListM2.get(2))/2));
        theFre+=0.1;
        theVel+=(theVel)/10;
       
        mixed.add(theVel);
        mixed.add(theFre);
        mixed.add(theAva);
        mixed.add(calcularFuerza(theVel, theFre, theAva));
        return mixed;       
    }

}
