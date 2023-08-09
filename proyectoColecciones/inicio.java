import java.util.ArrayList;

public class inicio {
    public static void main(String[] args) {

        ArrayList<categoria> listaCategorias = new ArrayList<>();
        categoria c1 = new categoria(123, "aseo");
        listaCategorias.add(c1);
        listaCategorias.add(new categoria(124,"licores"));


        for (categoria cat:listaCategorias) {
            System.out.println(listaCategorias.indexOf(cat)+":"+cat.nombre);
        }

        for (int i = 0; i < listaCategorias.size() ; i++) {
            System.out.println(listaCategorias.get(i).nombre);
        }

        ArrayList<nacional> listaProductosNacional = new ArrayList<nacional>();
        listaProductosNacional.add(new nacional(999,"jabon",listaCategorias.get(0)));

    }
}
