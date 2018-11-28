	
	import java.io.*;
	
	public class matricula{
	
	
	static alumno[] total = new alumno[1000];
	static curso[] c;
	static int contEstu = 0, valida;
	static String op;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   	
		   	
	

	public static void main(String[] arg)throws IOException, InterruptedException{
		
	
	while(true){
		
		System.out.println("\n----- Sistema de Matricula -----");
		System.out.println("1. Ingresar Estudiante");
		System.out.println("2. Ver Estudiantes");
		System.out.println("3. Salir");
		
		System.out.print("Digite opcion -> ");
		op = br.readLine();
		
		
		if(op.equals("1")){
		
		valida = crearEstu();	
					
		}//1
		
		
		if(op.equals("2")){
		
		if(valida!=1){
			System.out.println("\nNo existen estudiantes !!!!");	
		}else{
		verEstu();	
		}
		
					
		}//2
		
	
		
		
		if(op.equals("3")){
		System.out.println("Cerrando Programa");	
		Thread.sleep(2000);
		System.out.println("Programa Finalizado");
		System.exit(0);
		}//3
	}	
	
	
	
		
	}
	
	
	static int crearEstu()throws IOException{
		
		
		System.out.println("\n1. Con descuento por votar?");
		System.out.println("2. Sin descuento por votar?");
		System.out.print("Digite opcion -> ");
		String opcion = br.readLine();
		int opc = Integer.parseInt(opcion);
				
		if(opc<1 || opc>2){
		System.out.println("Opcion Incorrecta");	
		int x = crearEstu();
		}
		
		if(opc==1){
		total[contEstu] = new alumno(true);
		contEstu++;
		}
		
		if(opc==2){
		
		total[contEstu] = new alumno();
		contEstu++;
		
		}
		
		return 1;
	}		
	
	static void verEstu(){
		
		
		for (int i = 0; i<contEstu; i++) {
			System.out.println("\n---------------");
			System.out.println("Codigo  : "+total[i].cod);
			System.out.println("Nombre   : "+total[i].nombre);
			System.out.println("Apellido : "+total[i].ape);
												
			c = total[i].getCursos();
			
			System.out.println("-----");
			System.out.println("Cursos:\n");
					
			for (int k = 0; k<c.length; k++) {
				
					System.out.println((k+1)+":");
					System.out.println("Codigo : "+c[k].cod);
					System.out.println("Nombre : "+c[k].nombre);
					System.out.println("-----");
				
		    }
			
			
		}
		

		
	}
	
		
	
	
		
	}