package valor;

public class ValorApp {
    public static void main(String[] args) {
        int a=3;
        System.out.println("antes de la llamada: a="+a);
        funcion(a);
        System.out.println("después de la llamada: a="+a);

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }

    public static void funcion(int x){
        x=5;
        System.out.println("dentro de la función: a="+x);
    }
}


 