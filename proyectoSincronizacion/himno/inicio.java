package himno;

public class inicio {

	
	public static void main(String[] args) throws InterruptedException {
		String[] e1 ={"Oh,","gloria","inmarcesible", "Oh", "jubilo", "inmortal",
				"En,","surcos","de", "dolores", "el", "bien", "germina ya."};
		
		String[] e2 ={"Cesó","la horrible","noche", "la libertad", "sublime", "derrama",
				"las","auroras","de", "su", "invencible", "luz"};
		
			
		
		hilo h1 = new hilo("h1", e1);
		hilo h2 = new hilo("h2",e2);
		
		h1.start();
		h2.start();
		
		h1.join();
		h2.join();

	}

}
