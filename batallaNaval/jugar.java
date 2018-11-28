package todo;
import java.io.*;



public class jugar {
	
	static InputStreamReader isr;
	static BufferedReader br;
	
	
	
	static void juego()throws IOException{
	isr= new InputStreamReader(System.in);
	br= new BufferedReader(isr);
		
	String f;
	String c;
	
	while(true){
	System.out.print("\n\nDigite fila --> ");
	f= br.readLine();
	
	System.out.print("\nDigite Columna -->");
	c= br.readLine();
	System.out.println("");
	
	int filas= Integer.parseInt(f);
	int columnas= Integer.parseInt(c);
	
	if(filas>9 || filas<0 || columnas>9 || columnas<0){
		System.out.print("\nSu misil cayó fuera del campo de batalla. Pueden existir daños colaterales");
		juego();
	}else{
	
	tablero.escribir(filas, columnas);
	tablero.ver();
	}
	}
	
	
	}
	
	

}
