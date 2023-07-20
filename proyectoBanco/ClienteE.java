package bancario;

import java.io.*;

public class ClienteE extends Cliente{

	InputStreamReader isr;
	BufferedReader br;
	String Dpto, Ext, Cargo;
	
	public ClienteE()throws IOException {
		
		isr = new InputStreamReader(System.in);
		br =new BufferedReader(isr);
		
		System.out.println("Digite Departamento");
		Dpto= br.readLine();
		System.out.println("Digite Extensión");
		Ext= br.readLine();
		System.out.println("Digite Cargo");
		Cargo= br.readLine();
	}
	
		public String getDpto(){
		return Dpto;
		}
	
		public String getExt(){
		return Ext;
		}
		
		public String getC(){
			return Cargo;
		}
}