package banco;

public class inicio {

	
	public static void main(String[] args) throws InterruptedException {
		cajero.iniciar();
		
		
		hilo c1 = new hilo("c1");
		hilo c2 = new hilo("c2");
		hilo monitor=new hilo("monitor");
		
		hilo gob = new hilo("gobierno");
		
		gob.join();
		c1.join();
		c2.join();

	}//main
	
	static void consignar(int value){
		cajero.ingresar(value);
	}//
	
	static boolean retirar(int value){
		boolean v=false;
		if(value<getSaldo()){
			cajero.retirar(value);
			v=true;
		}
		return v;
	}//
	
	static int getSaldo(){
		return cajero.saldo;
	}

}//class
