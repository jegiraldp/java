import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class genetico {
    static Random r;
    public static void main(String[] args) {

        int tama=10;
        List<List<Double>> poblacion=getPoblacion(tama);
        poblacion=ordenarLista(poblacion);

        System.out.println("--------- M1 M2");
        System.out.println("M1:" + poblacion.get(0));
        System.out.println("M1:" + poblacion.get(1));
        System.out.println("--------- Mixed M1 M2");
        List <Double> theMixed = cruzarList(poblacion.get(0), poblacion.get(1));
        System.out.println(theMixed);
        
    }

    public static double calcularFuerza(double v, double f, double a){
        double t = (double) 200/a;
        double velTotal =v-f;
        double fuerza = Math.abs((double) 1/(velTotal/t));
        return fuerza;
    }

    public static List<Double> getIndividuo() {
        r = new Random();
        List<Double> individuo = new ArrayList<>();
        double velo=Math.abs(Math.round(r.nextDouble(20)+10));
        double frena=Math.round(r.nextDouble(5)+1);
        double ava=Math.round(r.nextDouble(6)+5);
        individuo.add(velo-frena); //velocidad
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

    public static List<List<Double>> ordenarLista(List<List<Double>> laPoblacion){
        laPoblacion.sort(Comparator.comparing(sublista -> sublista.get(3)));
        return laPoblacion;
    }

    public static List<Double> cruzarList(List<Double> theListM1,List<Double> theListM2){
        List<Double> mixed = new ArrayList<>();
        double theVel = Math.abs(Math.round((theListM1.get(0)+theListM2.get(0))/2));
        double theFre = Math.abs(Math.round((theListM1.get(1)+theListM1.get(1))/2));
        double theAva = Math.abs(Math.round((theListM1.get(2)+theListM1.get(2))/2));
        mixed.add(theVel-theFre);
        mixed.add(theFre);
        mixed.add(theAva);
        mixed.add(calcularFuerza(theVel, theFre, theAva));
        return mixed;       
    }

}
