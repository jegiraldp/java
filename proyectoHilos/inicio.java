import java.net.MalformedURLException;
import java.util.*;

public class inicio {

	static int[] n;
	public static Random r,r1,r2;
	static int c1,c2,c3,c1t,c2t,c3t;
		
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException{
		r=r1=r2= new Random();
				
		hilo snd =new hilo("sound");
		Thread.sleep(2000);
		hilo b =new hilo("board");
		hilo h1 =new hilo("h1");
		hilo h2 =new hilo("h2");
		hilo h3 =new hilo("h3");
		
		
		
		b.join();
		h1.join();
		h2.join();
		h3.join();
		snd.join();
		
		
		System.out.println("\nResultados oficiales");
		System.out.println("Hilo 1:"+c1t);
		System.out.println("Hilo 2:"+c2t);
		System.out.println("Hilo 3:"+c3t);
		if(c1t>c2t && c1t>c3t) System.out.println("\nGanador Hilo 1");
		if(c2t>c1t && c2t>c3t) System.out.println("\nGanador Hilo 2");
		if(c3t>c2t && c3t>c1t) System.out.println("\nGanador Hilo 3");
		System.out.println("");
		

	}//main
	
	static void vectorInicio(){
		n= new int[10];
		
		for (int i = 0; i < n.length; i++) {
			n[i]=1;
		}
		
	}//vector
	
	
	
	

	
	
}//class
