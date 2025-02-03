public class inicio {
    public static void main(String[] args) {

       Mensajero lambdaMensaje= ()-> System.out.println("hola desde lambda");
       lambdaMensaje.emitirMenssaje();

        Cuadrado c = (nombre)-> System.out.println("hola "+nombre);
        c.calcular("jorge");

        Suma s = (a,b) -> a+b;
        int r = s.suma(3,4);
        System.out.println("suma "+r);

        Cubo cubo = (x) -> x*x*x;
        int rCubo = cubo.calcularCubo(34);
        System.out.println("cubo "+rCubo);

        Resta laResta = (a,b)->a-b;
        int rr=laResta.resta(3,4);
        System.out.println("resta "+rr);


    }
}