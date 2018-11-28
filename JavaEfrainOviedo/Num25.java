/**
* EJERCICIO RESUELTO No. 25
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
*/ 


import java.io.*;//LIBRERIA NECESARIA PARA EL BUFFERED READER

public class Num25 extends Num24
{
//DEFINICION DE VARIABLES A NIVEL GLOBAL

  static int cosuc,cosuca,nf;
  static boolean sw; 
  static String cosucc,nfc;
  static long coven,covena; 
  static String covenc,vvc;
  static double vv,totven,totsuc,tote=0;
  static Num25 objeto=new Num25();
  static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
  static String temporal;
  static Number f;      

public void captura()throws IOException
{
       System.out.println("MENU");
       System.out.println("CAPTURA DE INFORMACION");
       System.out.println("**********************");
       do
	{
	  System.out.println("ENTRE CODIGO DE LA SUCURSAL O CERO PARA TERMINAR ");
	  cosucc=lector.readLine();	  
	  sw=objeto.valint(cosucc);
	  if(sw==false)
	   {
	     System.out.println("DIGITE SOLO NUMEROS,PRESIONE TECLA");
	     System.out.println("                ");
	     System.out.println("                                  ");
	   }
       }while(sw==false);
       cosuc=Integer.parseInt(cosucc);
       if(cosuc!=0)
       {
	do
	{
	  System.out.println("ENTRE  CODIGO DEL  VENDEDOR ");
	  covenc=lector.readLine();
	  sw=objeto.valint(covenc);
	  if(sw==false)
	   {
	     System.out.println("DIGITE SOLO NUMEROS,PRESIONE TECLA");
	     System.out.println("                  ");
	     System.out.println("                                  ");
	   }
       }while(sw==false);
       coven=Integer.parseInt(covenc);
       do
	{
	  System.out.println("ENTRE  NUMERO DE LA FACTURA ");
	  nfc=lector.readLine();
	  sw=objeto.valint(nfc);
	  if(sw==false)
	     System.out.println("              ");
	}while(sw==false);
       nf=Integer.parseInt(nfc);
       do
	{
	  System.out.println("ENTRE EL VALOR DE LA  VENTA ");
	  vvc=lector.readLine();
	  sw=objeto.valndec(vvc);
	  if(sw==false)
	     System.out.println("               ");
	}while(sw==false);

	f =  Float.valueOf(vvc); 
	vv = f.floatValue();
     }
}
 

   public static void main(String ar[]) throws IOException//MANEJA LAS EXEPCIONES DEL READLINE
   //FUNCION PRINCIPAL DEL PROGRAMA
   {
     int n;
     objeto.captura();
     while(cosuc !=0)
      {
	cosuca=cosuc;
	totsuc=0;
	while(cosuc==cosuca)
	  {

	    covena=coven;
	    totven=0;
	    while((coven==covena) && (cosuc==cosuca) && (cosuc !=0))
	    {
	     System.out.println("VENTAS DEL MES SUCURSAL "+cosuc);
	     System.out.println("**************************");
	     System.out.println("VENDEDOR   NRO.FACTURA     VALOR VENTA");
	     System.out.println(coven+"            "+nf+"         "+vv);
	     totven=totven+vv;
	     System.out.println("PRESIONE TECLA PARA CONTINUAR");
	     temporal=lector.readLine();
	     objeto.captura();
	     }
	    System.out.println("TOTAL VENDEDOR $ "+totven);
	    System.out.println("PRESIONE TECLA PARA CONTINUAR");
	    temporal=lector.readLine();
	    totsuc=totsuc+totven;
	  }
	tote +=totsuc;
	System.out.println("TOTAL SUCURSAL $ "+totsuc);
	temporal=lector.readLine();
      }
     System.out.println("TOTAL EMPRESA $ "+tote);
     System.out.println("PRESIONE TECLA PARA TERMINAR");
     }
}

