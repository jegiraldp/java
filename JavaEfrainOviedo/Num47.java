/**
* EJERCICIO RESUELTO No. 47
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
*/

 
import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num47
{

	static float sbr, deduc,su,sneto;
	
   static void cal_salario(float x,float y,int nh)
   {
     float pr;
     sbr=x*y;
     if(sbr < 400000)
       {
	 	if(nh > 6)
	  	 pr=0;
	  	else
	   	pr=(6-nh)/2;
       }
      	else
       	{
	 	if(nh < 3 )
	   	pr=3;
	  	else
	   	pr=10/nh;
       	}
     deduc=sbr*pr/100;
     su=2000*nh;
     sneto=sbr-deduc+su;
   }


	public static void main(String ar[]) 
			throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
	//FUNCION PRINCIPAL DEL PROGRAMA
    {
	Number f;
	BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
	String temporal;
	long cod; 
	int nh; 
	String nom;
    float sh,nht; 
    sbr=1;
    deduc=1;
    su=1;
    sneto=1;
     System.out.println("ENTRE EL CODIGO:           ");
	 temporal = lector.readLine();
     cod = Integer.parseInt(temporal);;
     while(cod !=0)
      {
		 System.out.println("ENTRE EL NOMBRE: "); 
		 nom= lector.readLine();
		 System.out.println("ENTRE NUMERO DE HIJOS: "); 
		 temporal = lector.readLine();
		 nh = Integer.parseInt(temporal);
		 System.out.println("ENTRE SALARIO POR HORA: "); 
		 temporal = lector.readLine();
		 f =  Float.valueOf(temporal); 
	   	 sh = f.floatValue();
	   	 System.out.println("ENTRE HORAS TRABAJADAS: "); 
		 temporal = lector.readLine();
		 f =  Float.valueOf(temporal); 
	   	 nht = f.floatValue();
	   	 cal_salario(nht,sh,nh);
		 System.out.println("UNIVERSIDAD DE ANTIOQUIA");
		 System.out.println("CODIGO: "+cod+" NOMBRE: "+nom);
		 System.out.println("DEVENGADO:  +$"+sbr);
		 System.out.println("DEDUCIDO :  -$"+deduc);
		 System.out.println("SUBSIDIO :  +$"+su);
		 System.out.println("NETO A PAGAR:$"+sneto);
		 System.out.println("PRESIONE TECLA PARA CONTINUAR");
		 System.out.println("ENTRE EL CODIGO O CERO PARA TERMINAR:           ");
		 temporal = lector.readLine();
		 cod = Integer.parseInt(temporal);
     }



	}
}