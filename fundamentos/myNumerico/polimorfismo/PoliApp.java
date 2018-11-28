

package polimorfismo;

public class PoliApp {
  public static void main(String[] args) {
    Gato gato=new Gato();
    hazleHablar(gato);

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
  }

  static void hazleHablar(Animal sujeto){
    sujeto.habla();
  }
}
