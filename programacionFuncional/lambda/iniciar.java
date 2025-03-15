public class iniciar{

    public static void main(String[] args) {
        
        iIniciar num = (a)->a*2;
        System.out.println(num.porDos(4));

        iIniciar num2 = (a)->a*10;
        System.out.println(num2.porDos(10));

        /////
        /// 

        iMayuscula p = (xx)-> xx.toUpperCase();
        System.out.println(p.mayuscula("jorge"));

        //
        iOperacion ope = (r,t)-> r+t;
        System.out.println(ope.operacion(5, 6));

        //
        calcular(ope, 0, 1);

    }

    static void calcular(iOperacion op, int a, int b){
        System.out.println(op.operacion(a,b));
    }
}
