package sin;

public class inicio {

	
	public static void main(String[] args) throws InterruptedException {
		hilo h1 = new hilo("h1");
		hilo h2 = new hilo("h2");
		
		h1.start();
		h2.start();
		
		h1.join();
		h2.join();
	}//main

}//class
