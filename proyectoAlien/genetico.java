import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class genetico {
    public static void main(String[] args) {
/*
        int tama=100;
        List<List<Double>> poblacion=getPoblacion(tama);
        poblacion.sort(Comparator.comparing(sublista -> sublista.get(1)));


        for (int i = 0; i < poblacion.size(); i++) {
            System.out.println(poblacion.get(i));
        }

        System.out.println("---------");
        System.out.println("Peor:" + poblacion.get(tama-1));*/

    }

    public static double calcularFuerza(double v, double f, double a){
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

}
