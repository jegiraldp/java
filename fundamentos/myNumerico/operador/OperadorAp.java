package operador;


public class OperadorAp {
    public static void main(String[] args) {
        System.out.println("Operaciones con enteros");
        int ia=7, ib=3;
        int iSuma, iResto;
        iSuma=ia+ib;
        System.out.println("El resultado de la suma es "+iSuma);
        int iProducto=ia*ib;
        System.out.println("El resultado del producto es "+iProducto);
        System.out.println("El resultado del cociente es "+(ia/ib));
        iResto=ia%ib;
        System.out.println("El resto de la división entera es "+iResto);

        System.out.println("**********************************");
        System.out.println("Operaciones con números decimales");
        double da=7.5, db=3.0;
        double dSuma=da+db;
        System.out.println("El resultado de la suma es "+dSuma);
        double dProducto=da*db;
        System.out.println("El resultado del producto es "+dProducto);
        double dCociente=da/db;
        System.out.println("El resultado del cociente es "+dCociente);
        double dResto=da%db;
        System.out.println("El resto de la división es "+dResto);

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

