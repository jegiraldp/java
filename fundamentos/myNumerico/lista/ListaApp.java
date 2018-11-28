package lista;

public class ListaApp {

    public static void main(String[] args) {
        int[] valores={60, -4, 23, 12, -16};
        Lista lista=new Lista(valores);
        System.out.println("Valor mayor "+lista.valorMayor());
        System.out.println("Valor menor "+lista.valorMenor());
        System.out.println("Valor medio "+lista.valorMedio());
        lista.imprimir();

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

