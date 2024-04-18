import java.util.Scanner;

public class inicio {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
        1.Registrar Producto Nacional
        2.Registrar Producto Importado
                3. Listar Productos Nacionales
                4. Listar productos importados

                */

/*
       nacional pn1 = new nacional(123,3000,"tetero", 999);
       importado pi1 = new importado(0101,500,"cama china",9898);

        System.out.println("--------- Lista de productos --------");
        System.out.print("\n"+pn1.getCodigo()+"\t"+pn1.nombre+"\t"+pn1.getValor());
        System.out.print("\n"+pi1.getCodigo()+"\t"+pi1.nombre+"\t"+pi1.getValor());*/

        producto[] listaP = new producto[3];
        nacional pn1 = new nacional(123,3000,"tetero", 999);
        listaP[0]=pn1;
        importado pi1 = new importado(0101,500,"cama china",9898);
        listaP[1]=pi1;
        importado pi2 = new importado(0102,500,"silla china",98982);
        listaP[2]=pi2;

        for (int i = 0; i <listaP.length ; i++) {
            System.out.println(listaP[i].getCodigo()+"\t"+listaP[i].nombre);
        }

    }
}
