package todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class principal {
	static InputStreamReader isr;
	static BufferedReader br;

	public static void main(String[] args)throws IOException {
		
		isr= new InputStreamReader(System.in);
		br= new BufferedReader(isr);
	while(true){
	System.out.println("\n\n\tMenu");
	System.out.println("\t1. Nuevo Juego");
	System.out.println("\t2. Salir");
	String op= br.readLine();
	
	if(op.equals("1")){
	tablero.crear();
	barco.crearBarcos();
	tablero.ver();
	jugar.juego();
	}
	if(op.equals("2")){
		System.out.println("\nHasta la vista");
		System.exit(3);
	}
	}//while

	}
	
}//clase
