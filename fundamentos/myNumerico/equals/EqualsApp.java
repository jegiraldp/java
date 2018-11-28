package equals;


public class EqualsApp {
    public static void main(String[] args) {
        String str1="El lenguaje Java";
        String str2=str1;
        System.out.println("String1 --> "+str1);
        System.out.println("String2 --> "+str2);
        System.out.println("¿Es el mismo objeto? --> "+(str2==str1));

        str2=new String(str1);
        System.out.println("String1 --> "+str1);
        System.out.println("String2 --> "+str2);
        System.out.println("¿Es el mismo objeto? --> "+(str2==str1));
        System.out.println("¿El mismo valor?     --> "+(str2.equals(str1)));

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

 