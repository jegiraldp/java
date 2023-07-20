import java.io.*;

public class curso{
	
	public String nombre;
	static String cc;
	public int cod;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	    	
	
	public curso()throws IOException{
		
	System.out.print("\nDigite Nombre Curso -> ");
	nombre = br.readLine();
	
	System.out.print("Digite Codigo del Curso -> ");
	cc = br.readLine();
	cod = Integer.parseInt(cc);

		
	}
	
}