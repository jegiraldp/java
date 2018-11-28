package sin;

public class hilo extends Thread{
	
	public hilo(String n){
		setName(n);
		
	}//
	
	public void run(){
		System.out.println(getName()+":Inicio");
		imprimir.contador(getName());
	}
	


}
