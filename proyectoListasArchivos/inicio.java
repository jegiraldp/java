import java.io.IOException;
import java.util.ArrayList;

public class inicio {
    static  producto pro;
    static String listado;
    static ArrayList<producto> listaProductos;
    public static void main(String[] args) throws IOException {

        cargar();
        crearProducto();
        //verLista();
        actualizar();

    }

    public static void actualizar(){
        String lineaEnviar="";
        for (producto p: listaProductos) {

            lineaEnviar=lineaEnviar+p.codigo+":"+p.nombre;
        }

        lineaEnviar= ";"+pro.codigo+","+pro.nombre;
        escribir.writeFile(listado+lineaEnviar);
        System.out.println("Producto registrado");
    }

        public static void crearProducto(){
       pro= new producto(897,"neverita");
       listaProductos.add(pro);

        }



        public static void verLista(){

            System.out.println("Lista productos");
            for (producto p: listaProductos) {

                System.out.print("\n"+p.codigo+":"+p.nombre);
            }
        }
public static void cargar()throws IOException {
    listado = leer.readFile();
    String[] productos = listado.split(";");
    String[] atributos = null;
    listaProductos = new ArrayList<>();



    for (int i = 0; i < productos.length; i++) {
        atributos = productos[i].split(",");
        pro = new producto(Integer.parseInt(atributos[0]), atributos[1]);
        listaProductos.add(pro);
    }
}

    }



