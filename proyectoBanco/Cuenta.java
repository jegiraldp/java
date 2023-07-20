package bancario;

import java.io.*;

public class Cuenta {
	
	InputStreamReader isr;
	BufferedReader br;
	Cliente objCliente;
	
	static String [][] mCuentas = new String [20][3];
	static String cuenta,cedula;
	static int contFilas=0;

	public Cuenta() throws IOException{
	
		int r, r2;
		isr = new InputStreamReader(System.in);
		br =new BufferedReader(isr);
		
		System.out.println("Digite Numero Cuenta");
		cuenta= br.readLine();
		r = bCuenta(cuenta);
		
		if(r==0){	
		
		System.out.println("Digite Cedula");
		cedula= br.readLine();
		
		r2=Cliente.buscarC(cedula);
		
		if(r2==0){
		System.out.println("Cliente no existe  -- Debe crearlo");
		}
		if(r2==1){
			System.out.println(" -- Cliente Existe --");
			guardarCuenta(cuenta,cedula);
		}
		
		}//if r==0
		else{
			System.out.println("Cuenta repetida");	
		}
			
	}
	
	void guardarCuenta(String cta, String ced){
		mCuentas[contFilas][0]= cta;
		mCuentas[contFilas][1]= "50000";
		mCuentas[contFilas][2]= ced;
				
		contFilas++;
		System.out.println(" -- Cuenta Creada con Éxito --");
	}
	
	static int bCuenta(String id){
    	id= id.trim();
		int retorno = 0; 
    	
    	for (int i = 0; i < contFilas; i++) {
    		
    		if(mCuentas[i][0].equals(id)){
    			retorno=1;
    			break;
    		}else{
    			retorno=0;
    		}
    	}
    	return retorno;
    }
	
	static void verCuentas(){
		  
		  if(contFilas==0){
			  System.out.println("\nNo hay cuentas creadas");
		  }else{
			  System.out.println("\n --- Cuentas del BancoBancario---");
			  System.out.println("\nCódigo\tSaldo\tCliente");
			  for (int i = 0; i<contFilas; i++) {
				 for (int j = 0; j < 3; j++) {
					 System.out.print(mCuentas[i][j]+"\t");
				}
				 System.out.println("");
			 }//for
		  }
		}

	static String bSaldo(String id){
    	id= id.trim();
		String retorno="50000"; 
    	
    	for (int i = 0; i < contFilas; i++) {
    		
    		if(mCuentas[i][0].equals(id)){
    			retorno=mCuentas[i][1];
    			break;
    		}else{
    			retorno="50000";
    		}
    	}
    	return retorno;
    }
	
	static void consignar(String idC, int Dinero){
		idC= idC.trim();
		int money;
		   	
    	for (int i = 0; i < contFilas; i++) {
    		
    		if(mCuentas[i][0].equals(idC)){
    			mCuentas[i][1]=mCuentas[i][1].trim();
    			money=Integer.parseInt(mCuentas[i][1]);
    			money+=Dinero;
    			mCuentas[i][1]=money+"";
    		}
    	}//for		
	}
	
	static void Retirar(String idC, int Dinero){
		idC= idC.trim();
		int money;
		   	
    	for (int i = 0; i < contFilas; i++) {
    		
    		if(mCuentas[i][0].equals(idC)){
    			mCuentas[i][1]=mCuentas[i][1].trim();
    			money=Integer.parseInt(mCuentas[i][1]);
    			money-=Dinero;
    			mCuentas[i][1]=money+"";
    		}
    	}//for	
	}
}
