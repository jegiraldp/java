package banco;

public class cajero {
	
	public static int saldo;
	
	static void iniciar(){
		saldo=100;		
	}//
	
	static void retirar(int v){
		saldo-=v;
	}//
	
	static void ingresar(int v){
		saldo+=v;
	}//

}
