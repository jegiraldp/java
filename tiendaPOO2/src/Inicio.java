import java.util.ArrayList;
import java.util.Scanner;
public class Inicio {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Nacional> listaN = new ArrayList<>();
        String nombre="tetero";
        int codigo=123;
        String RD="RD123";
        listaN.add(crearPN(nombre,codigo,RD));
        for (int i = 0; i <listaN.size() ; i++) {
            System.out.println(listaN.get(i).getCodigo());
            System.out.println(listaN.get(i).nombre);
        }
    }
    static Nacional crearPN(String n, int c, String rd){
        Nacional on = new Nacional(n,c,rd);
        return on;
    }
}
