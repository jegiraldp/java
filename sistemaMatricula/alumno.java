import java.io.*;


public class alumno{
	
	String nombre, ape, numeroC, docu;
	int cod,numCursos;
	boolean voto;
	static int matriculaValor = 100000;
	int valorCurso=5000;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static curso[] c;
	
    	
    	
	public alumno(boolean v)throws IOException{
		
	System.out.print("\nDigite Documento cccc-> ");
	docu = br.readLine();
	cod = Integer.parseInt(docu);
		
	System.out.print("Digite Nombre -> ");
	nombre = br.readLine();
	
	System.out.print("Digite Apellido -> ");
	ape = br.readLine();
	
	System.out.print("Digite Numero Cursos -> ");
	numeroC = br.readLine();
	numCursos = Integer.parseInt(numeroC);
	c = new curso[numCursos];
	valorCurso *= numCursos;
	
			
	for (int i = 0; i<numCursos; i++) {
		c[i]= new curso();
	}
	
	System.out.println("\nCursos Creado Satisfactoriamente");
   
    matriculaValor -= 50000;
    matriculaValor += valorCurso;
	}//alumno con descuento
	
	
	public alumno()throws IOException{
	
	System.out.print("\nDigite Documento -> ");
	docu = br.readLine();
	cod = Integer.parseInt(docu);
		
	System.out.print("Digite Nombre -> ");
	nombre = br.readLine();
	
	System.out.print("Digite Apellido -> ");
	ape = br.readLine();
	
	System.out.print("Digite Numero Cursos -> ");
	numeroC = br.readLine();
	numCursos = Integer.parseInt(numeroC);
	c = new curso[numCursos];
	int yy;
	
	for (int i = 0; i<numCursos; i++) {
		c[i]= new curso();
		
    }
    
    System.out.println("\nCursos Creado Satisfactoriamente");
	valorCurso *= numCursos;
   
    matriculaValor += valorCurso;

		
	}//alumno sin descuento
	
	
	
	public curso[] getCursos(){
		return c;
	}
	
}