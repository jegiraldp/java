package bancario;

import java.io.*;

public class ClienteG extends Cliente{

	InputStreamReader isr;
	BufferedReader br;
	String telefono, direccion;
	
	public ClienteG()throws IOException {
		
		isr = new InputStreamReader(System.in);
		br =new BufferedReader(isr);
		
		System.out.println("\nDigite telefono");
		telefono= br.readLine();
		System.out.println("Digite direccion");
		direccion= br.readLine();
	}
	
		public String getTel(){
		return telefono;
		}
	
		public String getDir(){
		return direccion;
		}
	
}
