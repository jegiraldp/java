

package polimorfismo1;

public class PoliApp {

  public static void main(String[] args) {
    Gato gato=new Gato();
    hazleHablar(gato);
    Cucu cucu=new Cucu();
    hazleHablar(cucu);

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
  }
  
  static void hazleHablar(Parlanchin sujeto){
    sujeto.habla();
  }
}
