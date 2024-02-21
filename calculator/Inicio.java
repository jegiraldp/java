import java.util.*;

public class Inicio {
    public static void main(String[] ar) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Calculator 2000");
        System.out.print("Digite número 1 -> ");
        int a = scn.nextInt();
        System.out.print("\nDigite número 2 ->");
        int b = scn.nextInt();

        int rSum = Sumar.calcular(a,b);
        System.out.println("La suma es "+rSum);

        Restar objRestar = new Restar();
        int rRes = objRestar.calcular(a,b);
        System.out.println("La resta es "+rRes);

        Multiplicar.calcular(a,b);
        int rMul = Multiplicar.resul;
        System.out.println("La multiplicación es "+rMul);

        if(b==0){
            System.out.println("No se puede dividir por cero");
        }else{
            double rDiv = Dividir.calcular(a,b);
            System.out.println("La división es "+rDiv);
        }

    }
}
