package string;


public class StringApp {

    public static void main(String[] args) {
//longitud del string
 	    String str="El primer programa";
	    System.out.println("longitud "+str.length());
//comienza y termina por...
    	str="El primer programa";
        System.out.println("comienza por El      "+str.startsWith("El"));
        System.out.println("termina por programa "+str.endsWith("programa"));
//posición de un carácter
	    int pos=str.indexOf('p');
        System.out.println("posición de la letra p "+pos);
//segunda ocuurencia de p
	    pos=str.indexOf('p', pos+1);
//comparación
  	    str="Tomás";
	    System.out.println("Orden alfabético "+str.compareTo("Alberto"));
  	    str="Alberto";
	    System.out.println("Orden alfabético "+str.compareTo("Tomás"));
	    System.out.println("Orden alfabético "+str.compareTo("Alberto"));
//substring
        str="El lenguaje Java";
	    System.out.println("Substring "+str.substring(12));
	    System.out.println("Substring "+str.substring(3, 11));
 //eliminar los espacios en blanco
 	    str="  12 ";
	    System.out.println("string original               "+str);
	    System.out.println("string sin espacios en blanco "+str.trim());
 //convertir un número en string
        int valor=24;
        str=String.valueOf(valor);
	    System.out.println("número --> string "+str);
 //convertir un string en número
	    str="  12 ";
	    int numeroInt=Integer.parseInt(str.trim());
	    System.out.println("string --> número "+numeroInt);
        str="12.35 ";
	    double numeroDouble=Double.valueOf(str).doubleValue();
	    System.out.println("string --> número "+numeroDouble);

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
      }
}

 