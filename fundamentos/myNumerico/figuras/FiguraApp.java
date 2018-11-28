package figuras;

public class FiguraApp {
    public static void main(String[] args) {
//enlace temprano
        Circulo c=new Circulo(0, 0, 5.5);
        System.out.println("Area del círculo "+c.area());
        Rectangulo r=new Rectangulo(0, 0, 5.5, 2.0);
        System.out.println("Area del rectángulo "+r.area());
 //enlace tardío
        Figura f=new Circulo(0, 0, 5.5);
        System.out.println("Area del círculo "+f.area());
        f=new Rectangulo(0, 0, 5.5, 2.0);
        System.out.println("Area del rectángulo "+f.area());
//array de objetos  
        Figura fig[]=new Figura[4];
        fig[0]=new Rectangulo(0,0, 5.0, 7.0);
        fig[1]=new Circulo(0,0, 5.0);
        fig[2]=new Circulo(0, 0, 7.0);
        fig[3]=new Rectangulo(0,0, 4.0, 6.0);
        Figura fMayor=figuraMayor(fig);
        System.out.println("El área mayor es "+fMayor.area());

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

