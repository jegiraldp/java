public class InicioCedula {

    public static void main(String[] args) {
        Cedula c = Cedula.getInstance();
        System.out.println(c);

        Cedula c2 = Cedula.getInstance();
        System.out.println(c2);

        
    }
    
}
