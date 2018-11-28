

package list1;

public class ListaApp1 {

  public static void main(String[] args) {
        Lista lista=new Lista(new int[] {60, -4, 23, 12, -16});
        System.out.println("Valor mayor "+lista.valorMayor());
        System.out.println("Valor menor "+lista.valorMenor());
        System.out.println("Mostrar la lista");
        System.out.println(lista);

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }

  }
}
