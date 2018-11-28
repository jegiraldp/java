package himno;

public class hilo extends Thread{

		public String[] frases;
	
		public hilo(String n , String[] frases){
			setName(n);
			this.frases=frases;
			
		}//
		
		public void run(){
			imprimir.himno(this.frases);
		}///

	}


