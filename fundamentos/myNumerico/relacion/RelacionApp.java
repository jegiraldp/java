package relacion;

public class RelacionApp {
    public static void main(String[] args) {
        int i=8;
        System.out.println("i vale "+i);
        System.out.println("i<5 es "+(i<5));
        System.out.println("i>5 es "+(i>5));
        System.out.println("i==8 es "+(i==8));
        System.out.println("i!=8 es "+(i!=8));
        System.out.println("i<=10 es "+(i<=10));
        System.out.println("i>=10 es "+(i>=10));

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

