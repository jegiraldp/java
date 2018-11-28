package primos;

public class PrimosApp {
    public static void main(String[] args) {
        boolean bPrimo;
        System.out.println("Números primos comprendidos entre 3 y 100");
        for(int numero=3; numero<100; numero+=2){
            bPrimo=true;
            for(int i=3; i<numero/2; i+=2){
                if(numero%i==0){
                    bPrimo=false;
                    break;
                }
            }
            if(bPrimo){
                System.out.print(numero+" - ");
            }
        }
        
        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

