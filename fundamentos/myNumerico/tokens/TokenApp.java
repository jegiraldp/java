package tokens;

import java.util.StringTokenizer;

public class TokenApp {

    public static void main(String[] args) {
	    String nombre="Angel Franco García";
	    StringTokenizer tokens=new StringTokenizer(nombre);
        while(tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }

	    String strDatos="6.3\n6.2\n6.4\n6.2";
	    tokens=new StringTokenizer(strDatos, "\n");
        int nDatos=tokens.countTokens();
        double[] datos=new double[nDatos];
        int i=0;
        while(tokens.hasMoreTokens()){
            String str=tokens.nextToken();
            datos[i]=Double.valueOf(str).doubleValue();
            System.out.println(datos[i]);
            i++;
        }

        try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

 