public class temporal {

    public static void main(String[] args) {
        int[] x = new int[5];

        servicio[] listaServicios = new servicio[2];

        listaServicios[0] = new servicio(123,120000,"cambio aceite");
        listaServicios[1] = new servicio(124,60000,"alineacion");

        for (servicio s:listaServicios) {
            System.out.println(s.getCodigo()+" "+s.nombre);
        }

    }
}
