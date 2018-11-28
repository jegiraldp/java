package clonico1;


public class ClonicoApp1 {
    public static void main(String[] args) {
        int[] datos={2, 5, -1, 3, 0};
        Lista lista=new Lista(datos, "ordenar");
        System.out.println("antes ----->"+ lista);
        lista.menor();
        System.out.println("despues ---->"+ lista);
        System.out.println("************************");
        System.out.println("antes ------> "+ lista);
        lista.mayor();
        System.out.println("despues ----> "+ lista);

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

