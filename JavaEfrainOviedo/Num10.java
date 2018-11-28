/**
* EJERCICIO RESUELTO No. 10
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*/
import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num10
{
	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	{
		
	   BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
	   String temporal;
	   String nom;
	  
	   long ni; int est;
	   double pat,pagomat=50000;
	   System.out.println("ENTRE N§ DE INSCRIPCI[ON              ");
	   temporal = lector.readLine();
	   ni=Integer.parseInt(temporal);
	   System.out.println("ENTRE EL NOMBRE:                                ");
	   nom=lector.readLine();
	   System.out.println("ENTRE EL PATRIMONIO:              ");
	   temporal = lector.readLine();
	   pat=Double.parseDouble(temporal);
	   System.out.println("ENTRE EL ESTRATO:  ");
	   temporal = lector.readLine();
	   est=Integer.parseInt(temporal);
	   if(pat > 2000000)
	   pagomat=pagomat + 0.03 * pat;
	   System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION:        ");
	   System.out.println(ni);
	   System.out.println("Y NOMBRE:                          ");
	   System.out.println(nom);
	   System.out.print("DEBE PAGAR:$");
	   System.out.println(pagomat);
	   System.out.println("PRESIONE TECLA ");
	   	   
	}
}




