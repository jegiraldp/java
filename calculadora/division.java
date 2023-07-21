public class division {
    public static double calcular(int a, int b) {
        double res = 0;
        try {
            res = (double) a / b;
        } catch (Exception e) {
            System.out.println("Error !!! No puedes dividir por cero");
        }

        return res;
    }
}