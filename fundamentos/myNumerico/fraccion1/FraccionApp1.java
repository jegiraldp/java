package fraccion1;

public class FraccionApp1 {
  static public void main(String[] args) {
     Fraccion x=new Fraccion(2,3);
     Fraccion y=new Fraccion(4,3);
     Fraccion z=new Fraccion(1,2);
     System.out.println("x--> "+x);
     System.out.println("y--> "+y);
     System.out.println("z--> "+z);
     System.out.println("x+y= "+Fraccion.sumar(x, y));
     System.out.println("x*y= "+Fraccion.multiplicar(x,y));
//primero suma x e y y luego hace el producto con z
     Fraccion resultado=Fraccion.multiplicar(Fraccion.sumar(x,y),z);
     System.out.println("(x+y)*z= "+resultado);
     System.out.println(resultado.simplificar());

     try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}
