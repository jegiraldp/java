package rectangulo1;

public class RectanguloApp1 {
     public static void main(String[] args) {
        Rectangulo rect1=new Rectangulo(10, 20, 40, 80);
        Rectangulo rect2=new Rectangulo(40, 80);
        Rectangulo rect3=new Rectangulo();
 	    int medidaArea=rect1.calcularArea();
	    System.out.println("El área del rectángulo es "+medidaArea);

 	    rect2.desplazar(10, 20);

        if(rect1.estaDentro(20,30)){
	        System.out.println("El punto está dentro del rectángulo");
        }else{
	        System.out.println("El punto está fuera del rectángulo");
        }

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

