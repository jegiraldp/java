import java.util.ArrayList;
import java.util.Random;

public class probado {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(getIndividuo());
        }

    }

    public static ArrayList<Integer> getIndividuo() {
        Random r = new Random();
        ArrayList<Integer> individuo = new ArrayList<>();
        individuo.add(r.nextInt(400)+100); //velocidad
        individuo.add(r.nextInt(50)); // frenado
        individuo.add(r.nextInt(6)+5);
        return individuo;
    }
}
