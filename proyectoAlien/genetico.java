import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class probado {
    public static void main(String[] args) {


        List<List<Double>> laPoblacion=getPoblacion(10);
        for (int i = 0; i < laPoblacion.size(); i++) {
            System.out.println(laPoblacion.get(i));
        }

    }

    public static double calcularFuerza(double v, double f, double a){
        DecimalFormat df = new DecimalFormat("#.##");
        double t = (double) 200/a;
        double velTotal =v-f;
        double fuerza = (double) 1/(velTotal/t);
        return fuerza;
    }

    public static List<Double> getIndividuo() {
        Random r = new Random();
        List<Double> individuo = new ArrayList<>();
        double velo=Math.round(r.nextDouble(100)+50);
        double frena=Math.round(r.nextDouble(30));
        double ava=Math.round(r.nextDouble(6)+5);
        /*System.out.println(velo);
        System.out.println(frena);
        System.out.println(ava);
        double velo=100;
        double frena=30;
        double ava=5;*/
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

}
