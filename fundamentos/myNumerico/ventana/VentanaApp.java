package ventana;

public class VentanaApp {

    public static void main(String[] args) {
        VentanaTitulo ventana=new VentanaTitulo(0, 0, 20, 30, "Principal");
        ventana.mostrar();
        ventana.cambiarDimensiones(10, -5);
        ventana.desplazar(4, 3);
        System.out.println("************************");
        ventana.mostrar();


        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
  }
}

 