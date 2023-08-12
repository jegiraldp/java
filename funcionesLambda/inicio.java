public class inicio{
    public static void main(String[] args) {
        calcular((a,b)->a+b,2,4);

        iSaludo s = (String nombre)->"hola "+nombre;
        System.out.println(s.saludar("jorge"));
    }

    static void calcular(iOperacion op, int a, int b){
        System.out.println(op.operacion(a,b));
    }


}
