package figuras1;

public class FigurasApp1 {
    public static void main(String[] args) {
//array de objetos
        Figura fig[]=new Figura[4];
        fig[0]=new Rectangulo(0,0, 5.0, 2.0);
        fig[1]=new Circulo(0,0, 3.0);
        fig[2]=new Cuadrado(0, 0, 5.0);
        fig[3]=new Triangulo(0,0, 7.0, 12.0);
        Figura fMayor=figuraMayor(fig);
        System.out.println("El área mayor es "+fMayor.area());
//el operador instanceof
        Rectangulo rect=new Rectangulo(0,0, 5.0, 2.0);
        System.out.println(rect instanceof Figura);
        System.out.println(rect instanceof Rectangulo);
        System.out.println(rect instanceof Cuadrado);

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }

//determinar la figura que tiene el área mayor
   static Figura figuraMayor(Figura figuras[]){
        Figura mFigura=null;
        double areaMayor=0.0;
        for(int i=0; i<figuras.length; i++){
            if(figuras[i].area()>areaMayor){
                areaMayor=figuras[i].area();
                mFigura=figuras[i];
            }
        }
        return mFigura;
    }
}

