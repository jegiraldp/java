package pi;

public class PiApp {
  public static void main(String[] args) {
//pol�gonos inscritos en una circunferencia de radio unidad
    double perimetro=3*Math.sqrt(3);      //tri�ngulo equil�tero inscrito
    long n=3;
    int i=0;
    while(i<30){
        perimetro=2*n*Math.sqrt(2.0-Math.sqrt(4.0-(perimetro/n)*(perimetro/n)));
        n=2*n;
        i++;
        System.out.println(i+" -- "+perimetro/2);
    }
    try  {
//espera la pulsaci�n de una tecla y luego RETORNO
        System.in.read();
    }catch (Exception e) {  }
  }
}
