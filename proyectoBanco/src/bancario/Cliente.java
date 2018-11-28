package bancario;

import java.io.*;


public class Cliente {

	InputStreamReader isr;
	BufferedReader br;
	static String N, ced, tipo, dir, tel, e, d, c, retornar;
	static int contFilas=0, re;
	static String [][] mClientes = new String [20][7];
	ClienteG objClienteG;
	ClienteE objClienteE;
	
	public Cliente(boolean Sobrecarga)throws IOException {
		
		isr = new InputStreamReader(System.in);
		br =new BufferedReader(isr);
		
		System.out.println("\nDigite Tipo Cliente :");
		System.out.println("1: General");
		System.out.println("2: Empleado");
		tipo= br.readLine();
		
		if(tipo.equals("1")){
			
			objClienteG = new ClienteG();
			tel=objClienteG.getTel();
			dir=objClienteG.getDir();
			
			guardaCliente(N, ced, tel, dir);
		}
		if(tipo.equals("2")){
			
			objClienteE = new ClienteE();
			e=objClienteE.getExt();
			d=objClienteE.getDpto();
			c=objClienteE.getC();
			
			guardaCliente(N, ced, e, d, c);
		}
		if(!(tipo.equals("1")||tipo.equals("2"))){
			//por defecto es cliente general			
		}
	}
	
	public Cliente(int Sobrecarga){
		//no hace nada
	}
	
	public Cliente()throws IOException{
		isr = new InputStreamReader(System.in);
		br =new BufferedReader(isr);
		
		System.out.println("\nDigite Nombre Completo :");
		N= br.readLine();
		
		System.out.println("Digite Cedula :");
		ced= br.readLine();
		
		re = buscarC(ced);
		
		if(re==1){
			System.out.println("Esta cedula ya existe");
			Principal.main(null);
		}
		
		
	}
     
	//guarda cliente general
	public void guardaCliente(String nombre, String cedul, String telef, String dire){
		
		mClientes[contFilas][0]= nombre;
		mClientes[contFilas][1]= cedul;
		mClientes[contFilas][2]= telef;
		mClientes[contFilas][3]= dire;
		mClientes[contFilas][4]= "0";
		mClientes[contFilas][5]= "0";
		mClientes[contFilas][6]= "0";
			
		System.out.println("Cliente General Creado con Éxito");
		contFilas++;
				
	}

	//guarda cliente empleado
	public void guardaCliente(String nombre, String cedula, String ext, String depart, String cargo){
		
		mClientes[contFilas][0]= nombre;
		mClientes[contFilas][1]= cedula;
		mClientes[contFilas][2]= "0";
		mClientes[contFilas][3]= "0";
		mClientes[contFilas][4]= ext;
		mClientes[contFilas][5]= depart;
		mClientes[contFilas][6]= cargo;
			
		System.out.println("Cliente Empleado Creado con Éxito");
		contFilas++;
	}
	
	  static int buscarC(String cedula){
		cedula = cedula.trim();
    	int retorno = 0; 
    	
    	for (int i = 0; i < contFilas; i++) {
    		if(mClientes[i][1].equals(cedula)){
    			retorno=1;
    			break;
    		}else{
    			retorno=0;
    		}
    	}
    	return retorno;
    }
	  
	  static void verClientes(){
		  
		  if(contFilas==0){
			  System.out.println("\nNo hay clientes creados");
		  }else{
			  System.out.println("\n --- Clientes del BancoBancario---");
			  System.out.println("\nNombre\tCed\tTel\tDir\tExt\tDep\tCargo");
			  for (int i = 0; i<contFilas; i++) {
				 for (int j = 0; j < 7; j++) {
					 System.out.print(mClientes[i][j]+"\t");
				}
				 System.out.println("");
			 }//for
		  }
		}
		
}
