package rectangulo;


public class RectanguloApp {
    public static void main(String[] args) {
        Rectangulo rect1=new Rectangulo(100, 200);
        Rectangulo rect2=new Rectangulo(new Punto(44, 70));
        Rectangulo rect3=new Rectangulo();
        rect1.desplazar(40, 20);
        System.out.println("el área es "+rect1.calcularArea());
        int areaRect=new Rectangulo(100, 50).calcularArea();
        System.out.println("el área es "+areaRect);

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {
        }
    }
}

