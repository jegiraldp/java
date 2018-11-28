/**
* EJERCICIO RESUELTO No. 24
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Num24
{
	//DEFINICION DE VARIABLES A NIVEL GLOBAL

  	static long cod;
	static String codc,cods,codsa,nom,salc;
  	static double sal,totsuc;
	static float  number;        

	static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
	static String temporal;
    static Num24 objeto=new Num24();

  
  /* ESTA FUNCION VALIDA UN NUMERO ENTERO INT O LONG DEVUELVE
   * TRUE SI EL NUMERO SE DIGITA SOLO DIGITOS O FALSE SI SE DIGITO
   * CUALQUIER OTRO CARACTER
   */

public boolean valint(Object o)
{
	String numc;
	numc=o.toString();
	int prueba=0;
	try
	{
		prueba=Integer.parseInt(numc);
		return true; 
	}
	catch(NumberFormatException ex)
	{
		System.out.println("Numero ingresado no es valido");
		return false;
	}
			
}
  

  /* ESTA FUNCION VALIDA UN NUMERO FLOAT DOUBLE O LONG DOUBLE
   * DEVUELVE TRUE SI SE ENTRAN NUMEROS Y PUNTO DECIMAL O FALSE SI SE
   * ENTRAN CARACTERES DISTINTOS
   */

public boolean valndec(Object o )
    {  
		Float f;
	    try
		{
			f =  Float.valueOf(o.toString()); 
		    	number = f.floatValue();
	    		return true;  
   		}
	  	catch(NumberFormatException ex)
	  	{
			return false;
	  	}
		
      
      
   }

 /*
  * FUNCION QUE CAPTURA LA INFORMACION
  */
public void captura_inf()throws IOException
   {
     int nc,i;
     boolean sw=false;
     System.out.println("CAPTURA DE INFORMACION");
     System.out.println("**********************");
     do
      {
	 System.out.println("ENTRE CODIGO DEL EMPLEADO: ");
	 codc= lector.readLine();
	 sw=objeto.valint(codc);
	 if(sw==false)
	 System.out.println("             ");
	  
       }while(sw==false);
     cod=Integer.parseInt(codc);
     if(cod!=0)
      {
       do
	{
	  System.out.println("ENTRE CODIGO DE LA SUCURSAL:"); 
	  cods = lector.readLine();
	  sw=objeto.valint(cods);
	  if(sw==false)
	   {
	     System.out.println("              ");
	   }
	}while(sw==false);
       do
	{
	  System.out.println("ENTRE NOMBRE DEL EMPLEADO:  ");
	  nom=lector.readLine();

	}while(sw==false);
	nc=nom.length();
       do
	{
	  System.out.println("ENTRE SALARIO DEL EMPLEADO: ");
	  salc=lector.readLine();
	  sw=objeto.valndec(salc);
	  if(sw==false)
	   {
	    System.out.println("                     ");
	   }
	}while(sw==false);
	sal=Integer.parseInt(salc);       
      }
   }


/*
 * FUNCION PRINCIPAL
 */	
public static void main(String ar[])throws IOException
  {
     objeto.captura_inf();
     while(cod != 0)
      {
	codsa=cods;
	totsuc=0;
	while((cods.equals(codsa)) && (cod!= 0))
	{
	  System.out.println("REPORTE DE SALARIOS SUCURSAL: "+cods);
	  System.out.println("\t\tCODIGO :\t"+cod);
	  System.out.println("\t\tNOMBRES:\t"+nom);
	  System.out.println("\t\tSALARIO:\t"+sal);
	  System.out.println("PRESIONE TECLA PARA CONTINUAR ");
	  temporal = lector.readLine();
	  totsuc+=sal;
	  objeto.captura_inf();
	}
       System.out.println("TOTAL SALARIOS DE LA SUCURSAL:$ "+totsuc);
       System.out.println("PRESIONE TECLA PARA PASAR A OTRA SUCURSAL");
       }




   }
 	

}

  
