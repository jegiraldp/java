package factorial1;

public class FactorialApp1 {
    public static void main(String[] args) {
        int numero=4;
        long resultado=1;
        while(numero>0){
            resultado*=numero;
            numero--;
        }
        System.out.println("El factorial es "+resultado);

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

