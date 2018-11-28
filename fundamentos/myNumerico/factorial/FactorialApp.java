package factorial;

public class FactorialApp {
    public static void main(String[] args) {
        int numero=4;
        long resultado=1;
//empleando for
        for(int i=1; i<=numero; i++){
            resultado*=i;
        }
        System.out.println("El factorial es "+resultado);
 
        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

