public class inicio {
    public static void main(String[] args) {

        int x = 3;
        int y = 6;

        int su = suma.sumar(x,y);
        System.out.println("La suma es "+su);

        System.out.println("La resta es "+resta.restar(x,y));

        persona objPersona1 = new persona(45,"El flaco");
        objPersona1.saludar();

        persona objPersona2 = new persona(46, "El gordo");
        objPersona2.saludar();

        System.out.println("Codigo antiguo "+objPersona1.getCodigo());
        System.out.println("Codigo antiguo "+objPersona2.getCodigo());
        objPersona1.setCodigo(455);
        objPersona2.setCodigo(466);
        System.out.println("Codigo nuevo "+objPersona1.getCodigo());
        System.out.println("Codigo nuevo "+objPersona2.getCodigo());
    }
}
