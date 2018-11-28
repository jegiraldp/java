package unario;

public class UnarioApp {
    public static void main(String[] args) {
        int i=8;
        int a, b, c;
        System.out.println("\tantes\tdurante\tdespués");
        i=8; a=i; b=i++; c=i;
        System.out.println("i++\t"+a+'\t'+b+'\t'+c);
        i=8; a=i; b=i--; c=i;
        System.out.println("i--\t"+a+'\t'+b+'\t'+c);

        i=8; a=i; b=++i; c=i;
        System.out.println("++i\t"+a+'\t'+b+'\t'+c);
        i=8; a=i; b=--i; c=i;
        System.out.println("--i\t"+a+'\t'+b+'\t'+c);

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

